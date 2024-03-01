package main

import (
	"os"
  "github.com/gin-gonic/gin"
)

func main() {
	port := os.Getenv("PORT")
	if port == "" {
		port = "8080"
	}

  r := gin.New()
	
	Customers(r)

  r.Run("localhost:" + port) // listen and serve on 0.0.0.0:8080 (for windows "localhost:8080")
}