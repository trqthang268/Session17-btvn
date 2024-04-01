package baitap02;

import java.util.Scanner;

public class Baitap02 {
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
        if (n == 0) {
            throw new RuntimeException("Mảng rỗng, không có phần tử");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println("Nhập số thứ "+i);
                arrInt[i] = Integer.parseInt(scanner.nextLine());
            }
            int max = arrInt[0];
            for (int i = 0; i < arrInt.length; i++) {
                if (arrInt[i]>max){
                    max = arrInt[i];
                }
            }
            System.out.println("Số lớn nhất tìm được là "+max);
        }

    }
}
