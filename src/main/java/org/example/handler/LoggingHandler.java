package org.example.handler;

import org.example.entity.Request;

public class LoggingHandler implements RequestHandler{

    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        // Log request details
        System.out.println("Logging request: " + request.toString());

        // Pass the request to the next handler
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
