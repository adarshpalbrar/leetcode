package com.springwell.records;

public class RecordsEx {

    public static void main(String[] args) {

        Product product = new Product(100123L, "iPhone", "iPhone");
        System.out.println(product.description());

        System.out.println(product.hasDescription());


        Customer customer = new Customer(1001124L, "Adarshpal Brar", "adarshpal.brar@gmail.com");
    }
}
