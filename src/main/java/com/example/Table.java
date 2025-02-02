package com.example;

public abstract class Table {

    public String GetMessage() {
        String connection = ConnectionPool.GetConnection();

        return String.format("Hello %s!", connection);
    }
}
