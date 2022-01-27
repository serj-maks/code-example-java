package com.vault.stack;

class Stack {

    int stk[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    // заполнение стека
    void push(int item) {
        if (tos == 9) {
            System.out.println("stack is full");
        } else
            stk[++tos] = item;
    }

    // вывод значений стека
    int pop() {
        if (tos < 0) {
            System.out.println("stack is not loaded");
            return 0;
        } else
            return stk[tos--];
    }
}