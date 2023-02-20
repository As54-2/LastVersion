package com.example.RestaurantManagment.Exceptions;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String message) {
        super((message));
    }
}
