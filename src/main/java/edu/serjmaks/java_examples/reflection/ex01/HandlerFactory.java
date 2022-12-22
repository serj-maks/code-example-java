package com.vault.reflection.ex01;

import com.vault.reflection.ex01.annotation.*;
import com.vault.reflection.ex01.handler.*;

import java.lang.annotation.Annotation;
import java.util.Map;

public class HandlerFactory {

    private static final DefaultHandler DEFAULT_HANDLER = new DefaultHandler();
    private static final Map<Class<? extends Annotation>, AnnotationHandler> handlerMap = Map.of(
        Length.class, new LengthAnnotationHandler(),
        Email.class, new EmailAnnotationHandler(),
        Adulthood.class, new AdulthoodAnnotationHandler(),
        Min.class, new MinAnnotationHandler(),
        Max.class, new MaxAnnotationHandler()
    );

    public AnnotationHandler getHandler(Class<? extends Annotation> type) {
        return handlerMap.getOrDefault(type, DEFAULT_HANDLER);
    }
}
