package org.example.handler;

import org.example.entity.Request;

public class AuthorizationHandler implements RequestHandler{

    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        // Check authorization
        if (request.getUser() == null || !request.getUser().isAuthorized()) {
            System.out.println("Authorization failed: User not authorized");
            return;
        }
        System.out.println("Authorization passed.");

        // Pass the request to the next handler
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}


