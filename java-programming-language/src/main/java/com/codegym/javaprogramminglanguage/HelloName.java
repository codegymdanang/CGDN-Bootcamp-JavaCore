package com.codegym.javaprogramminglanguage;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name=scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
