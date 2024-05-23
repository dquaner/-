package org.dyy.structural.adapter.spring;

import java.util.ArrayList;
import java.util.List;

import org.dyy.structural.adapter.spring.adapter.AnnotationHandlerAdapter;
import org.dyy.structural.adapter.spring.adapter.HandlerAdapter;
import org.dyy.structural.adapter.spring.adapter.HttpHandlerAdapter;
import org.dyy.structural.adapter.spring.adapter.SimpleHandlerAdapter;
import org.dyy.structural.adapter.spring.controller.AnnotationController;
import org.dyy.structural.adapter.spring.controller.Controller;
import org.dyy.structural.adapter.spring.controller.HttpController;
import org.dyy.structural.adapter.spring.controller.SimpleController;

public class DispatcherServlet {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatcherServlet() {
        // sorted handlerAdapters
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() throws Exception {
        // 模拟 SpringMVC 从 request 取 handler 对象
        Controller handler = getHandler("http");
        // 得到对应适配器
        HandlerAdapter ha = getHandlerAdapter(handler);
        // 通过适配器执行对应 controller 方法
        ha.handle(handler);
    }

    private HandlerAdapter getHandlerAdapter(Controller handler) throws Exception {
        for (HandlerAdapter ha: handlerAdapters) {
            if (ha.supports(handler)) {
                return ha;
            }
        }
        throw new Exception("No adapter for handler [" + handler +
                "]: The DispatcherServlet configuration needs to include a HandlerAdapter that supports this handler");
    }

    private Controller getHandler(String request) {
        return switch (request) {
            case "annotation" -> new AnnotationController();
            case "http" -> new HttpController();
            default -> new SimpleController();
        };
    }

    public static void main(String[] args) throws Exception {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.doDispatch();
    }
}
