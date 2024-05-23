package org.dyy.structural.adapter.spring.controller;

public class SimpleController implements Controller {
    public void doSimpleHandler() {
        System.out.println("simple...");
    }
}
