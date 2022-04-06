package com.vault.stack;

class Main {

    public static void main(String args[]) {

        Stack mystack1 = new Stack();

        // заполнение стека
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }

        // вывод значений стека от 0 до 10
        System.out.println("stack in mystack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }

        Stack mystack2 = new Stack();

        // заполнение стека
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }

        // вывод значений стека от 0 до 10
        System.out.println("stack in mystack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
    }
}