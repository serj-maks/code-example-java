package com.vault.exception.ex01_own_exception_class;

public class ExceptionClass extends RuntimeException {

    public ExceptionClass(String message) {
        super(message);
    }
}
