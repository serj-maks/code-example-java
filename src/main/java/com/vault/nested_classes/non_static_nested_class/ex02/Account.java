package com.vault.nested_classes.non_static_nested_class.ex02;

public class Account {
    private double amount;
    private final String number;
    private final String owner;

    public Account(String number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    private synchronized double withdraw(final double amountToWithdraw) {
        if (amountToWithdraw > getAmount()) {
            final double amountToReturn = getAmount();
            return amountToReturn;
        }
        if (amountToWithdraw < 0) {
            return .0;
        }
        this.amount = this.amount - amountToWithdraw;
        return amountToWithdraw;
    }

    public class Card {
        private final String number;

        public Card(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public double withdraw(final double amountToWithdraw) {
            // обращение к объекту внешнего класса, т.к. если использовать просто this,
            // то происходит обращение к объекту внутренненего класса
            return Account.this.withdraw(amountToWithdraw);
        }
    }
}
