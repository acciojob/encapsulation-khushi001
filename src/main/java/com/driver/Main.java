package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // obj.name = "John"; // Error: The field name is not visible
        // System.out.println(obj.name); // Error: The field name is not visible

        obj.setName("John");
        System.out.println(obj.getName());
    }
}