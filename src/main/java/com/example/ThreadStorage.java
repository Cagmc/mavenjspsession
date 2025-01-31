package com.example;

public class ThreadStorage {
    private static final ThreadLocal<String> threadLocalVariable = new ThreadLocal<>();

    public static void setValue(String value) {
        threadLocalVariable.set(value);
    }

    public static ThreadLocal<String> getThreadLocalVariable() {
        return threadLocalVariable;
    }
}
