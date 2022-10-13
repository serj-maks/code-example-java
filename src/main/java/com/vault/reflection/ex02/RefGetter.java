package com.vault.reflection.ex02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * get and show any class field
 */
public class RefGetter {

    public void showClass(Object object) {
        Class<? extends Object> anyClass = object.getClass();
        System.out.println(anyClass.getName());
    }

    public void showMethod(Object object) {
        Class<? extends Object> anyClass = object.getClass();
        Method[] declaredMethods = anyClass.getMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
    }

    public void showField(Object object) {
        Class<? extends Object> anyClass = object.getClass();
        Field[] declaredFields = anyClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }

    public void showAnnotation(Object object) {
        Class<? extends Object> anyClass = object.getClass();
        Field[] fields = anyClass.getDeclaredFields();
        // логика отличается от остальных методов, потому что у аннотации нет метода "getName()"
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(field.getName() + " : " + annotation.toString());
            }
        }
    }
}
