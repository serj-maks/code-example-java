package com.vault.reflection.ex01.handler;

import com.vault.reflection.ex01.AnnotationHandler;

import java.lang.annotation.Annotation;
import java.time.LocalDate;
import java.time.Period;

public class AdulthoodAnnotationHandler implements AnnotationHandler {

    @Override
    public Error handle(Annotation annotation, Object value) {
        LocalDate today = LocalDate.now();
        Period period = Period.between((LocalDate) value, today);
        if (period.getYears() < 18) {
            return new Error("Error! Age [" + value + "] incorrect");
        } else {
            System.out.println("AdulthoodAnnotation. Errors not found");
        }
        return null;
    }
}
