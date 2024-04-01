package baitap13;

import java.util.Scanner;

public class Baitap13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần đảo ngược");
        String str = scanner.nextLine();
        if (str == null || str.isBlank()){
            throw new RuntimeException("Chuỗi nhập vào không hợp lệ");
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse()); // dùng stringbuider đảo ngược chuỗi
    }
}
