package baitap11;

import java.util.Scanner;

public class Baitap11 {
    public static void main(String[] args) throws DateException {
        int year, month, date;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập số năm :");
                year = Integer.parseInt(scanner.nextLine());
                if (year < 0) {
                    throw new DateException("Năm không hợp lệ");
                } else {
                    break;
                }
            } catch (NumberFormatException n) {
                System.err.println("Lỗi : Gía trị nhập vào không phải số nguyên.");
            }
        }

        while (true) {
            try {
                System.out.println("Nhập số tháng :");
                month = Integer.parseInt(scanner.nextLine());
                if (month < 1 || month > 12) {
                    throw new DateException("Tháng không hợp lệ");
                } else {
                    break;
                }
            } catch (NumberFormatException n) {
                System.err.println("Lỗi : Gía trị nhập vào không phải số nguyên.");
            }
        }

        while (true) {
            try {
                System.out.println("Nhập số ngày :");
                date = Integer.parseInt(scanner.nextLine());
                boolean exit = false;
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        if (date < 1 || date > 31) {
                            throw new DateException("Ngày không hợp lệ");
                        } else {
                            exit = true;
                            break;
                        }

                    case 4, 6, 9, 11:
                        if (date < 1 || date > 30) {
                            throw new DateException("Ngày không hợp lệ");
                        } else {
                            exit = true;
                            break;
                        }

                    case 2:
                        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 && year % 400 != 0)) {
                            if (date < 1 || date > 29) {
                                throw new DateException("Ngày không hợp lệ");
                            } else {
                                exit = true;
                                break;
                            }
                        } else {
                            if (date < 1 || date > 28) {
                                throw new DateException("Ngày không hợp lệ");
                            } else {
                                exit = true;
                                break;
                            }
                        }
                    default:
                        break;
                }
                if (exit){
                    break;
                }
            } catch (NumberFormatException n) {
                System.err.println("Lỗi : Gía trị nhập vào không phải số nguyên.");
            }
        }
        System.out.println("Giá trị ngày tháng năm hợp lệ");
    }
}
