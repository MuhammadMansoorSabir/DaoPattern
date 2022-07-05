package com.example.management.filters;

import org.apache.commons.validator.EmailValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@Component
@Order(1)
public class MyFilter extends OncePerRequestFilter {
    private static final Logger LOG= LoggerFactory.getLogger(MyFilter.class);
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        String a=req.getHeader("name");
//        System.out.println(a);
//        boolean valid = EmailValidator.getInstance().isValid(a);
        String header=request.getHeader("name");
//        System.out.println(a);
//        System.out.println(request.getParameter("name"));
//        LOG.info("in my filter class ");
//        System.out.println(header);
        if(Objects.equals(req.getHeader("Token"), "Xpas24sx8sa")) {
            filterChain.doFilter(request, response);
        }
        else{
            System.out.println("UnAuthorized");
        }
    }
}
