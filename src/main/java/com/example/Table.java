package com.example;

public abstract class Table {
    private final ConnectionPool connectionPool = new ConnectionPool();

    public String GetMessage() {
        //String connection = connectionPool.GetConnection();
        String connection = ConnectionPool.GetConnectionStatic();

        return String.format("Hello %s!", connection);
    }
}
