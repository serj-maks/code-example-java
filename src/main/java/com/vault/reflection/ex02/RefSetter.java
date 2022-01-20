package com.vault.reflection.ex02;

import java.lang.reflect.Field;

/**
 * set and show any class field
 */
public class RefSetter {

    public void setField(Object object) {
        Class<? extends Object> anyClass = object.getClass();
        Field[] fields = anyClass.getDeclaredFields();
        for (Field field : fields) {
            AnnotationForRef annotation = field.getAnnotation(AnnotationForRef.class);
            if (annotation == null) {
                continue;
            }
            field.setAccessible(true);
            try {
                field.set(object, "Pwned! Setted by RefSetter");
            } catch (IllegalAccessException e) {
                e.printStackTrace(System.err);
            }
            field.setAccessible(false);
        }
    }
}
