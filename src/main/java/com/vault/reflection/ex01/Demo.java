package com.vault.reflection.ex01;

import java.time.LocalDate;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException {
        Validator<CustomerDto> validator = new Validator<>();
        CustomerDto dto = new CustomerDto("a", "@123gmail.com", LocalDate.of(2020,8,29), 99);
        List<Error> errors = validator.validate(dto);
        System.out.println(errors);
    }
}
