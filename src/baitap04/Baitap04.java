package baitap04;

import java.util.Arrays;

public class Baitap04 {
    public static void main(String[] args) {
        String[] arr = {"asdfs", "9", "12", "sdur", "1", "xyz", "14", "11", "10b"};
        int[] arrInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                arrInt[i] = Integer.parseInt(arr[i]);
            }catch (NumberFormatException e){
                System.out.println(arr[i] + " Không phải là 1 số nguyên");
                arrInt[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrInt));
    }
}
