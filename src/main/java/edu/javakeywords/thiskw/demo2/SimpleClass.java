package edu.javakeywords.thiskw.demo2;

public class SimpleClass {

    void printM() {
        System.out.println("m");
    }

    void printN() {
        System.out.println("n");
        // jvm автоматически подставляет ключевое слово "this" перед методом "printM()"
        // this.printM();
        // в данном случае ключевое слово "this" писать НЕ нужно, просто знай, что оно там есть и оно здесь используется
        printM();
    }
}
