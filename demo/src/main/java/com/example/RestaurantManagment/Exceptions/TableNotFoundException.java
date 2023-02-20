package com.example.RestaurantManagment.Exceptions;

public class TableNotFoundException extends RuntimeException {
    public TableNotFoundException(String message) {
        super((message));
    }
}
