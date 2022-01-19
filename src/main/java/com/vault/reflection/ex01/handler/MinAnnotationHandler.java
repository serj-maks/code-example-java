package com.vault.reflection.ex01.handler;

import com.vault.reflection.ex01.AnnotationHandler;
import com.vault.reflection.ex01.annotation.Min;

import java.lang.annotation.Annotation;

public class MinAnnotationHandler implements AnnotationHandler {

    @Override
    public Error handle(Annotation annotation, Object value) {
        Min minAnnotation = (Min) annotation;
        int min = minAnnotation.value();
        int annotationInput = ((Integer) value);
        if (annotationInput < min) {
            return new Error("Error! Min [" + value + "] is incorrect");
        } else {
            System.out.println("MinAnnotation. Errors not found");
        }
        return null;
    }

}
