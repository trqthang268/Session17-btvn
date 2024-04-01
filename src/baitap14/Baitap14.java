package baitap14;

import java.util.Scanner;

public class Baitap14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println("Nhập số lượng phần tử của mảng");
                n = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số nguyên");
            }
        }
        int[] arrInt = new int[n];
        if (n <= 0) {
            throw new RuntimeException("Mảng rỗng, không có phần tử");
        } else {
            for (int i = 0; i < n; i++) {
                try {
                    System.out.println("Nhập số thứ " + (i + 1));
                    arrInt[i] = Integer.parseInt(scanner.nextLine());
                }catch (ArithmeticException | NumberFormatException e){
                    System.err.println("Lỗi ở giá trị nhập vào. Vui lòng nhập lại.");
                }
            }
            int sum = 0;
            for (int i = 0; i < arrInt.length; i++) {
                sum += arrInt[i];
            }
            System.out.println("Giá trị trung bình của mảng "+(sum/n));
        }
    }
}
