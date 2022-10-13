package com.vault.abstract_method.ex01;

public abstract class AReplacer {

    // обычный метод - не нужно переопределять в наследниках
    public String process() {
        final String text = this.readString();
        final String result = text.replace(":)", "=)");
        return result;
    }

    // абстрактный метод - нужно переопределять в наследниках
    // protected - чтобы метод внутренней логики не был публичным
    protected abstract String readString();
}
