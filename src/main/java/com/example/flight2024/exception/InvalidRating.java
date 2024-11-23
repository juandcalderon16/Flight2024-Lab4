package com.example.flight2024.exception;

public class InvalidRating extends RuntimeException {
     public InvalidRating() {
         super();
     }

     public InvalidRating(String message) {
         super(message);
     }
}
