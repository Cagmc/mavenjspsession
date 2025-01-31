package com.example;

import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class SessionInfoFilter implements Filter {

    @Inject
    private SessionManager sessionManager;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        //sessionManager.setTenantId("Company-1");
        ThreadStorage.setValue("Company-1");

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
