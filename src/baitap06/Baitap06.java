package baitap06;

import java.util.Scanner;

public class Baitap06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sobichia;
        while (true) {
            try {
                System.out.println("Nhập số bị chia");
                sobichia = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.err.println("Lỗi : Giá trị nhập vào không phải là số nguyên");
            }
        }
        int sochia;
        while (true) {
            try {
                System.out.println("Nhập số chia");
                sochia = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.err.println("Lỗi : Giá trị nhập vào không phải là 1 số nguyên");
            }
        }
        if (sochia == 0) {
            throw new RuntimeException("Số chia không thể là số 0");
        }
        int ketqua = sobichia/sochia;
        System.out.println("Kết quả phép chia là "+ ketqua);
    }
}
