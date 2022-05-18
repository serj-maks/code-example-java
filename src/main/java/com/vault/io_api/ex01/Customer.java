package com.vault.io_api.ex01;

public class Customer implements Comparable<Customer> {
    private String name;
    private String phoneNumber;
    private int score;

    public Customer(String name, String phoneNumber, int score) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        if (this.score == o.score) {
            return this.name.compareTo(o.name);
        } else {
            return o.score - this.score;
        }
    }
}
