package baitap01;

import java.text.ParseException;
import java.util.Scanner;

public class Baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//  Khai báo hai biến nguyên để lưu giá trị hai số.
        int num1;
        int num2;
        while (true){
//  Sử dụng try-catch để bắt ngoại lệ khi người dùng nhập giá trị không phải số nguyên.
//  Nếu ngoại lệ xảy ra, hiển thị thông báo lỗi và yêu cầu nhập lại.
            try {
                System.out.println("Nhập số thứ nhất");
                num1 = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println("Vui lòng nhập số nguyên");
            }
        }
        while (true){
            try {
                System.out.println("Nhập số thứ hai");
                num2 = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println("Vui lòng nhập số nguyên");
            }
        }
//        Tính tổng và hiển thị kết quả
        int sum = num1+num2;
        System.out.println("Tổng 2 số nguyên là "+sum);
    }
}
