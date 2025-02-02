package com.example;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.spi.CDI;

import java.util.Dictionary;
import java.util.Hashtable;

@Dependent
public class ConnectionPool {

    private static final Dictionary<String, String> stringDictionary = new Hashtable<>();

    static {
        stringDictionary.put("Company-1", "company-1");
        stringDictionary.put("Company-2", "company-2");
    }

    public static String getConnection() {
        System.out.println("GetConnection");
        SessionManager sessionManager = CDI.current().select(SessionManager.class).get();
        String tenantId = sessionManager.getTenantId();
        System.out.println("Tenant ID: " + tenantId);

        String threadTenantId = ThreadStorage.getThreadLocalVariable().get();
        System.out.println("Thread Tenant ID: " + threadTenantId);

        return stringDictionary.get(tenantId);
    }
}