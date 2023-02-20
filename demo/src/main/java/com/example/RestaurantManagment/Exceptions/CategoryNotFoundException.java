package com.example.RestaurantManagment.Exceptions;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String message) {
        super((message));
    }
}
