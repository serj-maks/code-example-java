package com.vault.reflection.ex01.handler;

import com.vault.reflection.ex01.AnnotationHandler;

import java.lang.annotation.Annotation;

public class DefaultHandler implements AnnotationHandler {

    @Override
    public Error handle(Annotation annotation, Object value) {
        System.out.println("handler for annotation not found " + annotation);
        return null;
    }
}
