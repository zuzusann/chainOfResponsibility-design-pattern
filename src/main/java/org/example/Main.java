package org.example;

import org.example.entity.Request;
import org.example.entity.User;
import org.example.handler.AuthorizationHandler;
import org.example.handler.LoggingHandler;
import org.example.handler.RequestHandler;
import org.example.handler.ValidationHandler;

public class Main {
    public static void main(String[] args) {
        User user = new User("john_doe", true);
        Request request = new Request("Important Data", user);

        // Create handlers
        RequestHandler validationHandler = new ValidationHandler();
        RequestHandler authorizationHandler = new AuthorizationHandler();
        RequestHandler loggingHandler = new LoggingHandler();

        // Set up the chain of responsibility
        validationHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(loggingHandler);

        // Start the request processing chain
        validationHandler.handleRequest(request);
    }

}