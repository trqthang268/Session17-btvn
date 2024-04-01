package baitap05;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap05 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 23, 67, 43, 7, 3, 8, 4, 7, 12, 9, 12, 21, 9, 43};
        QuickSort.printArray(arr);
        Scanner scanner = new Scanner(System.in);
        QuickSort.quickSort(arr, 0, arr.length - 1);
        QuickSort.printArray(arr);
        System.out.println("Nhập gía trị cần tìm kiếm trong mảng");
        int findInt = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(arr,findInt);
        if (result == -1){
            throw new RuntimeException("Phần tử "+findInt+ " không được tìm thấy trong mảng");
        }else{
            System.out.println("Phần tử "+findInt+ " được tìm thấy ở vị trí "+result);
        }
    }
//  thuật toán tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int findInt) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == findInt) {
                return mid;
            } else if (arr[mid] < findInt) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
