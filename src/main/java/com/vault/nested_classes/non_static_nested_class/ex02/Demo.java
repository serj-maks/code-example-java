package com.vault.nested_classes.non_static_nested_class.ex02;

public class Demo {

    public static void main(String[] args) {
        final Account account = new Account("123qwr123", "Sergey");
        final Account.Card card = account.new Card("1234 1234 1234 1234");
    }
}
