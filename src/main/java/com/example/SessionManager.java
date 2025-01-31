package com.example;

import java.io.Serializable;

public class SessionManager implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tenantId;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
