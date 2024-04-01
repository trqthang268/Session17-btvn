package baitap03;

public class Baitap03 {
    public static void main(String[] args) {
        String[] arr = {"asdfs","9","12","sdur","1","xyz","14","11","10b"};
        int sum = 0;
        for (String string : arr) {
            try{
                sum+=Integer.parseInt(string);
            }catch (NumberFormatException e){
                System.out.println(string + " Không phải số nguyên");
            }
        }
        System.out.println("Tổng mảng số nguyên là "+sum);
    }
}
