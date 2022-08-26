package main

import (
	"github.com/gin-gonic/gin"
)

func Customers(router *gin.Engine) {
	router.POST("/customers", insert())
	router.GET("/customers", get_customers())
}
