package com.vault.reflection.ex01.handler;

import com.vault.reflection.ex01.AnnotationHandler;
import com.vault.reflection.ex01.Error;
import com.vault.reflection.ex01.annotation.Email;
import org.apache.commons.validator.routines.EmailValidator;

import java.lang.annotation.Annotation;

public class EmailAnnotationHandler implements AnnotationHandler {

    @Override
    public Error handle(Annotation annotation, Object value) {
        Email emailAnnotation = (Email) annotation;
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!(emailValidator.isValid((String) value))) {
            return new Error("Error! E-mail [" + value + "] incorrect");
        } else {
            System.out.println("EmailAnnotation. Errors not found");
        }
        return null;
    }
}
