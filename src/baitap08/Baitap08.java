package baitap08;

import java.util.Scanner;

public class Baitap08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        while(true) {
            System.out.println("Nhập số cần kiểm tra");
            try {
                num = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException n){
                System.out.println("Lỗi : Giá trị nhập vào không phải số nguyên");
            }
        }
        boolean isSoNguyenTo = true;
        if(num < 2){
            throw new RuntimeException(num+" không phải số nguyên tố");
        }else{
            for (int i = 2; i <Math.sqrt(num) ; i++) {
                if (num % i ==0){
                    isSoNguyenTo = false;
                    throw new RuntimeException(num+" không phải số nguyên tố");
                }
            }
        }
        if (isSoNguyenTo){
            System.out.println(num + " là số nguyên tố");
        }
    }
}
