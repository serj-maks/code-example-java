package com.vault.string_api;

public class Main {
    public static void main(String[] args) {

        // test code
        String str1 = new String("java");
        String str2 = "java";
        String str3 = "Hello, World!";
        char [] charArray = {'a', '1', '$'};

        /**
         * статические метода String API
         */

        // valueOf() - превращает принимаемое значение в строку
        System.out.println(String.valueOf(65));


        // copyValueOf() - превращает массив типа 'char' в строку. Обратный метод "toCharArray()"
        System.out.println(String.copyValueOf(charArray));


        /**
         * методы объекта String API
         */

        // charAt() - выводит символ строки по индексу
        System.out.println(str1.charAt(0));


        // codePointAt() - возвращает символ в кодировке юникод по заданному индексу
        System.out.println(str1.codePointAt(0));


        // indexOf() - возвращает индекс символа по числу в кодировке юникод. Если такого нет - возвращает '-1'
        System.out.println(str1.indexOf(108));


        // compareTo() - сравнивает две строки. Если все ок - получаем '0'
        System.out.println(str1.compareTo(str2));


        // compareToIgnoreCase() - сравнивает две строки без учета нижнего и верхнего регистров. Если все ок - получаем '0'
        System.out.println(str1.compareToIgnoreCase(str2));


        // concat() - конкатенация (сложение) двух строк. Работа метода аналогична символу '+'
        System.out.println(str1.concat(str2));


        // isEmpty() - возвращает 'true', если длина строки равна 0
        System.out.println(str1.isEmpty());


        // length() - возвращает длинну строки. Пробелы тоже являются символами
        System.out.println(str1.length());


        // split() - делит строку по заданному символу
        String [] strArray = str3.split(", ");
        for (String elem : strArray) {
            System.out.println(elem);
        }


        // substring() - вырезает кусок строки по заданным индексам
        System.out.println(str1.substring(1,2));


        // toCharArray() - разбивает строку посимвольно и возвращает массив типа 'char'
        char [] charArray1 = str1.toCharArray();
        for (char elem : charArray1) {
            System.out.println(elem);
        }


        // trim() - обрезает пробелы в начале и\или в конце строки
        System.out.println(str1.trim());
    }
}
