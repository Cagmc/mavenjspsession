package com.example;

public abstract class Table {

    public String getMessage() {
        String connection = ConnectionPool.getConnection();

        return String.format("Hello %s!", connection);
    }
}
