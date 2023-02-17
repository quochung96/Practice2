package com.likelion.Practice.Week8.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class AppFilter implements Filter {




    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        Enumeration<String> headerNames = request.getHeaderNames();
        final String POST_MAN="Postman";
        String st = request.getHeader("user-agent");
        if (st.contains(POST_MAN)) {
            ((HttpServletResponse) servletResponse).addHeader("name","TRAN QUOC CHUNG");
            ((HttpServletResponse) servletResponse).setStatus(HttpServletResponse.SC_FORBIDDEN);
            ((HttpServletResponse) servletResponse).getWriter().write("Access is not allow");
            return;
        } else filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
