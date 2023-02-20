package com.example.RestaurantManagment.Exceptions;

public class OrderDetailsNotFoundException extends RuntimeException {
    public OrderDetailsNotFoundException(String message) {
        super((message));
    }
}
