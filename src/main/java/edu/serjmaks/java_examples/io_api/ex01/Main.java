package com.vault.io_api.ex01;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String UNSORTED_CSV_FILE_PATH = "src/main/java/edu/serjmaks/io/task2/unsorted_customers.csv";
    public static final String SORTED_CSV_FILE_PATH = "src/main/java/edu/serjmaks/io/task2/sorted_customers.csv";
    public static final String COMMA_SEPARATOR = ",";

    // sorted csv file, white sorted data to another csv file
    public static void main(String[] args) throws IOException {
        List<Customer> customers = readCustomersListFromCsv(UNSORTED_CSV_FILE_PATH);
        List<Customer> sortedCustomers = sort(customers);
        writeCustomersListToCsv(SORTED_CSV_FILE_PATH, sortedCustomers);
    }

    public static List<Customer> readCustomersListFromCsv(String path) throws IOException {
        List<Customer> customers = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Customer customer = convertToCustomer(line);
                customers.add(customer);
            }
        }
        return customers;
    }

    public static List<Customer> sort(List<Customer> customers) throws IOException {
        Comparator<Customer> comparator = Customer::compareTo;
        Collections.sort(customers, comparator);
        return customers;
    }

    public static void writeCustomersListToCsv(String path, List<Customer> customers) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"))) {
            for (Customer customer : customers) {
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(customer.getName().trim().length() == 0 ? "" : customer.getName());
                oneLine.append(COMMA_SEPARATOR);
                oneLine.append(customer.getPhoneNumber().trim().length() == 0 ? "" : customer.getPhoneNumber());
                oneLine.append(COMMA_SEPARATOR);
                oneLine.append(customer.getScore() < 0 ? "" : customer.getScore());
                bufferedWriter.write(oneLine.toString());
                bufferedWriter.newLine();
            }
        }
    }

    public static List<Customer> convertToCustomers(List<String> customersStrings) {
        List<Customer> customers = new ArrayList<>();
        for (String customerString : customersStrings) {
            String[] parts = customerString.split(COMMA_SEPARATOR);
            String name = parts[0];
            String phoneNumber = parts[1];
            int score = Integer.parseInt(parts[2]);
            customers.add(new Customer(name, phoneNumber, score));
        }
        return customers;
    }

    public static Customer convertToCustomer(String customerString) {
        String[] parts = customerString.split(COMMA_SEPARATOR);
        String name = parts[0];
        String phoneNumber = parts[1];
        int score = Integer.parseInt(parts[2]);
        return new Customer(name, phoneNumber, score);
    }
}
