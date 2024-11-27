package org.example.handler;

import org.example.entity.Request;

public interface RequestHandler {

    void setNextHandler(RequestHandler nextHandler);
    void handleRequest(Request request);
}
