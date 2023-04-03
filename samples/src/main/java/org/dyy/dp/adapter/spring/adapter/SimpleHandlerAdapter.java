package org.dyy.dp.adapter.spring.adapter;

import org.dyy.dp.adapter.spring.controller.SimpleController;

public class SimpleHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimpleHandler();
    }
}
