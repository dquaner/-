package org.dyy.dp.adapter.spring.adapter;

import org.dyy.dp.adapter.spring.controller.AnnotationController;

public class AnnotationHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}
