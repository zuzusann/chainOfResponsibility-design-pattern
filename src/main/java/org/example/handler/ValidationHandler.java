package org.example.handler;

import org.example.entity.Request;

public class ValidationHandler implements RequestHandler{


    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        // Perform validation
        if (request.getData() == null || request.getData().isEmpty()) {
            System.out.println("Validation failed: Data is empty or null");
            return;
        }
        System.out.println("Validation passed.");

        // Pass the request to the next handler in the chain
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

