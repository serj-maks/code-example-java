package com.vault.string_api.ex01;

public class Main {

    public static void main(String[] args) {
        // test code
        String str1 = new String("java");
        String str2 = "java";
        String str3 = "Hello, World!";
        char [] charArray = {'a', '1', '$'};

        // valueOf() - превращает принимаемое значение в строку
        System.out.println(String.valueOf(65));


        // copyValueOf() - превращает массив типа 'char' в строку. Обратный метод "toCharArray()"
        System.out.println(String.copyValueOf(charArray));


        // charAt() - выводит символ строки по индексу
        System.out.println(str1.charAt(0));


        // codePointAt() - возвращает символ в кодировке юникод по заданному индексу
        System.out.println(str1.codePointAt(0));


        // indexOf() - возвращает индекс символа по числу в кодировке юникод. Если такого нет - возвращает '-1'
        System.out.println(str1.indexOf(108));


        // lastIndexOf() - последний раз переданный в метод символ встречался
        // в строке (а строка это массив char) по данному индексу
        System.out.println(str1.lastIndexOf("j")); // 0


        // ищем данный символ с n-ого элемента массива
        System.out.println(str1.lastIndexOf("v", 2));


        // ищет совпадение последовательности символов в массиве и возвращает индекс
        // первого элемента строки, которая передана в метод
        System.out.println(str1.indexOf("ava")); // 1


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
        // метод берет 1 диапазон включительно, 2 - НЕ включительно
        System.out.println(str1.substring(1,3));


        // метод выводит с указанного номера элемента в массиве по конец строки
        System.out.println(str1.substring(0));


        // toCharArray() - разбивает строку посимвольно и возвращает массив типа 'char'
        char [] charArray1 = str1.toCharArray();
        for (char elem : charArray1) {
            System.out.println(elem);
        }


        // trim() - обрезает пробелы в начале и\или в конце строки
        System.out.println(str1.trim());


        // startWith() - проверяем, начинается ли какая-то строка с какого-го
        // символа или подстроки
        System.out.println(str1.startsWith("j"));


        // toString() - переводим в тип String
        Integer integer = new Integer(12);
        integer.toString();
        System.out.println(integer);

        // тоже самое, только короче
        System.out.println(Integer.toString(12));


        // parseInt() - приведение типа String в любой тип ПРИМИТИВА
        int i = Integer.parseInt("12");


        // valueOf() - приведение типа String в любой тип ОБЪЕКТА
        Integer b = Integer.valueOf("12");
        // но у объекта всегда есть возможность достать примитив
        int c = b.intValue();
    }
}
