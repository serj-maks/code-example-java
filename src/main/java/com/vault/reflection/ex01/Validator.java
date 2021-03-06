package com.vault.reflection.ex01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator<T> {

    private static final HandlerFactory handlerFactory = new HandlerFactory();

    public List<Error> validate(T dto) throws IllegalAccessException {
        List<Error> errors = new ArrayList<>();
        Field[] fields = dto.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                Object value = field.get(dto);
                AnnotationHandler handler = handlerFactory.getHandler(annotation.annotationType());
                Error error = handler.handle(annotation, value);
                if (error != null) {
                    errors.add(error);
                }
            }
        }
        return errors;
    }
}
