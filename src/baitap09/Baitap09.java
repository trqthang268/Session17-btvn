package baitap09;

import java.util.Scanner;

public class Baitap09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibonacci;
        int a=0;
        int b=1;
        int num;
        while (true){
            try {
                System.out.println("Nhập số thứ ");
                num = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println("Vui lòng nhập số nguyên");
            }
        }
        if (num<=0){
            throw new RuntimeException("Lỗi : n không phải là 1 số nguyên dương");
        }else{
            System.out.println("Dãy fibonacci thứ "+num);
            System.out.print(a+" "+b);
            for (int i = 2; i < num; i++) {
                fibonacci = a+b;
                System.out.print(" "+fibonacci);
                a=b;
                b=fibonacci;
            }
        }
    }
}
