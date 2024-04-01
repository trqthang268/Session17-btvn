package baitap10;

import java.util.Scanner;

public class Baitap10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r;
        double area;
        while (true){
            try{
                System.out.println("Nhập bán kính r");
                r = Double.parseDouble(scanner.nextLine());
                if (r <= 0 ){
                    System.err.println("Giá trị nhập vào phải lớn hơn 0. Vui lòng nhập lại!");
                }else{
                    break;
                }
            }catch (NumberFormatException e){
                System.err.println("Lỗi : Giá trị nhập vào không phải 1 số nguyên.");
            }
        }
        area = Math.PI*r*r;
        System.out.println("Diện tích hình tròn có bán kính " + r + " là "+area);
    }
}
