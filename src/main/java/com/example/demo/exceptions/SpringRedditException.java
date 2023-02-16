package com.example.demo.exceptions;

public class SpringRedditException extends RuntimeException {

    public SpringRedditException(String exMessage, Throwable cause) {
        super(exMessage, cause);
    }
}
