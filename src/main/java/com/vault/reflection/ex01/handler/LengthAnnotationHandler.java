package com.vault.reflection.ex01.handler;

import com.vault.reflection.ex01.AnnotationHandler;
import com.vault.reflection.ex01.Error;
import com.vault.reflection.ex01.annotation.Length;

import java.lang.annotation.Annotation;

public class LengthAnnotationHandler implements AnnotationHandler {

    @Override
    public Error handle(Annotation annotation, Object value) {
        Length lengthAnnotation = (Length) annotation;
        int length = ((String) value).length();
        int max = lengthAnnotation.max();
        int min = lengthAnnotation.min();
        if (!(length >= min && length <= max)) {
            return new Error("Error! Length [" + value + "] incorrect");
        } else {
            System.out.println("LengthAnnotation. Errors not found");
        }
        return null;
    }
}
