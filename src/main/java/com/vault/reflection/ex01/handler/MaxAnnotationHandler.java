package com.vault.reflection.ex01.handler;

import com.vault.reflection.ex01.AnnotationHandler;
import com.vault.reflection.ex01.annotation.Max;

import java.lang.annotation.Annotation;

public class MaxAnnotationHandler implements AnnotationHandler {

    @Override
    public Error handle(Annotation annotation, Object value) {
        Max maxAnnotation = (Max) annotation;
        int max = maxAnnotation.value();
        int annotationInput = ((Integer) value);
        if (annotationInput > max) {
            return new Error("Error! Max [" + value +"] incorrect");
        } else {
            System.out.println("MaxAnnotation. Errors not found");
        }
        return null;
    }


}
