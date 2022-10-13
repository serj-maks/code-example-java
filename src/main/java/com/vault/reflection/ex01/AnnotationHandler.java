package com.vault.reflection.ex01;

import java.lang.annotation.Annotation;

public interface AnnotationHandler {

    Error handle(Annotation annotation, Object value);
}
