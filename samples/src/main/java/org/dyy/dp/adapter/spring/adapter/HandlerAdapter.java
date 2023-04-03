package org.dyy.dp.adapter.spring.adapter;

public interface HandlerAdapter {
    boolean supports(Object handler);
    void handle(Object handler);
}
