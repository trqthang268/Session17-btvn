package baitap12;

import java.util.Scanner;

public class Baitap12 {
    public static void main(String[] args) throws ZeroValueException {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        while (true) {
            try {
                System.out.println("Nhập số thứ nhất");
                num1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số nguyên");
            }
        }
        while (true) {
            try {
                System.out.println("Nhập số thứ hai");
                num2 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số nguyên");
            }
        }
        if(num1 == 0 && num2 ==0){
            throw new ZeroValueException("Cả hai số nhập vào phải khác 0");
        }
        int ucln = 1;
        for (int i = 1; i < num1; i++) {
            if(num1%i==0 && num2%i==0){
                ucln=i;
            }
        }
        System.out.printf("Ước chung lớn nhất của %d và %d là %d",num1,num2,ucln);
    }
}
