package com.codegym.javaprogramminglanguage;

import java.util.Scanner;

public class CheckLeapYear {
    public void leapYear(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
            System.out.print("Nam ban nhap la nam nhuan!");
        } else {
            System.out.print("Nam ban nhap khong phai la nam nhuan!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap nam ban muon kiem tra: ");
        int year = scanner.nextInt();
        CheckLeapYear leap = new CheckLeapYear();
        leap.leapYear(year);

    }
}
