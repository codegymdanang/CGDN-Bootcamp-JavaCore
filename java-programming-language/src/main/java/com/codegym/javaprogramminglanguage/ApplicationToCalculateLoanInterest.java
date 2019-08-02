package com.codegym.javaprogramminglanguage;

import java.util.Scanner;

public class ApplicationToCalculateLoanInterest {
    Scanner scanner = new Scanner(System.in);

    public void rateMonth(double n) {
        System.out.print("Nhap vao so thang ma ban da gui ngan hang: ");
        int month = scanner.nextInt();
        System.out.print("Moi ban nhap vao he so lai suat: ");
        double interest = scanner.nextDouble();
        double money = n * month * interest;
        System.out.print("Toan bo so tien ban nhan duoc sau khi gui " + month + " la: " + money);
    }

    public static void main(String[] args) {
        ApplicationToCalculateLoanInterest interest = new ApplicationToCalculateLoanInterest();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien da gui ngan hang: ");
        double count = scanner.nextDouble();
        interest.rateMonth(count);

    }
}
