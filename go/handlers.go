package main

import (
	"context"
	"fmt"
	"time"

	"github.com/gin-gonic/gin"
	"go.mongodb.org/mongo-driver/bson"
	"go.mongodb.org/mongo-driver/mongo"
)

var userCollection *mongo.Collection = GetCollection(DB, "customers")

func insert() gin.HandlerFunc {
	return func(c *gin.Context) {
		ctx, cancel := context.WithTimeout(context.Background(), 20*time.Second)
		var customer customer
		defer cancel()

		//validate the request body
		if err := c.BindJSON(&customer); err != nil {
			fmt.Println(err)
			c.Abort()
			return
		}

		_, err := userCollection.InsertOne(ctx, customer)
		if err != nil {
			fmt.Println(err)
			c.Abort()
			return
		}

		c.String(200, "ok")
	}
}

func get_customers() gin.HandlerFunc {
	return func(c *gin.Context) {
		ctx, cancel := context.WithTimeout(context.Background(), 10*time.Second)
		defer cancel()

		var results []customer

		filter := bson.D{{}}
		cursor, err := userCollection.Find(ctx, filter)
		if err != nil {
			fmt.Println(err)
			c.Abort()
			return
		}

		for cursor.Next(ctx) {
			//Create a value into which the single document can be decoded
			var elem customer
			err := cursor.Decode(&elem)
			if err != nil {
				fmt.Println(err)
			}

			results = append(results, elem)

		}
		c.JSON(200, results)
	}
}
