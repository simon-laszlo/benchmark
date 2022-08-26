package main

type customer struct {
  Guid     string  `json:"guid"`
  First_name  string  `json:"first_name"`
  Last_name string  `json:"last_name"`
  Email  string `json:"email"`
  Address  string `json:"address"`
}