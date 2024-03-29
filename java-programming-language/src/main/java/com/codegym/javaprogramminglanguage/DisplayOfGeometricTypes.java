package com.codegym.javaprogramminglanguage;

import java.util.Scanner;

public class DisplayOfGeometricTypes {
    Scanner scanner = new Scanner(System.in);

    public void rectangle() {
        int cdai, crong;
        System.out.print("Moi ban nhap chieu dai: ");
        cdai = scanner.nextInt();
        System.out.print("Moi ban nhap chieu rong: ");
        crong = scanner.nextInt();
        for (int i = 0; i < cdai; i++) {
            for (int j = 0; j < crong; j++) {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    public void triangle() {
        int canh;
        System.out.print("Moi ban nhap canh cua tam giac vuong: ");
        canh = scanner.nextInt();
        int lchon;
        System.out.print("Moi ban nhap lua chon: ");
        lchon = scanner.nextInt();
        if (lchon == 1) {
            for (int i = 1; i <= canh; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                System.out.print("\r\n");
            }
        }
        if (lchon == 2) {
            for (int i = 1; i <= canh; i++) {
                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = canh - i; j >= 0; j--) {
                    System.out.print("*");
                }
                System.out.print("\r\n");
            }
        }
        if (lchon == 3) {
            for (int i = canh; i > 0; i--) {
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                System.out.print("\r\n");
            }
        }
        if (lchon == 4) {
            for (int i = 1; i <= canh; i++) {
                for (int j = canh; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = canh; k > canh - i; k--) {
                    System.out.print("*");
                }
                System.out.print("\r\n");
            }
        }
    }

    public void isosceles() {
        int high;
        System.out.println("Moi ban nhap duong cao cua tam giac: ");
        high = scanner.nextInt();

        for (int i = 0; i <= high; i++) {
            for (int j = high; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = high; k > high - i; k--) {
                System.out.print("*");
            }
            for (int j = high; j <= high + i; j++) {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    public static void main(String[] args) {
        DisplayOfGeometricTypes main = new DisplayOfGeometricTypes();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1:Draw the rectangle");
        System.out.println("2:Draw the Right triangle");
        System.out.println("3:Draw the isosceles triangle");
        System.out.print("Moi ban nhap lua chon: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                main.rectangle();
                break;
            case 2:
                main.triangle();
                break;
            case 3:
                main.isosceles();
                break;
            case 0:
                System.exit(0);
        }
    }
}
