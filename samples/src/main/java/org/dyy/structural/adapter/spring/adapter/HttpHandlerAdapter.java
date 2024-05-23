package org.dyy.structural.adapter.spring.adapter;

import org.dyy.structural.adapter.spring.controller.HttpController;

public class HttpHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}
