package baitap07;

import java.util.Scanner;

public class Baitap07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        while (true) {
            try {
                System.out.println("Nhập vào số thứ 1");
                num1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException num) {
                System.err.println("Lỗi : Giá trị nhập vào không phải số nguyên. Vui lòng nhập lại");
            }
        }
        while (true) {
            try {
                System.out.println("Nhập vào số thứ 2");
                num2 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException num) {
                System.err.println("Lỗi : Giá trị nhập vào không phải số nguyên. Vui lòng nhập lại");
            }
        }
        if (num1 > num2) {
            System.out.println("Số lớn nhất là " + num1);
        } else if (num2 > num1) {
            System.out.println("Số lớn nhất là " + num2);
        } else {
            System.out.println("2 số bằng nhau");
        }
    }
}
