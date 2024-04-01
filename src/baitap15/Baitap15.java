package baitap15;

public class Baitap15 {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            System.out.println(checkTriangle(4, 2, 3));
        }catch (IllegalTriangleException e){
            System.err.println("3 cạnh không hợp lệ để hình thành 1 tam giác");
        }
        try {
            System.out.println(checkTriangle(4,2,9));
        }catch (IllegalTriangleException e){
            System.err.println("3 cạnh không hợp lệ để hình thành 1 tam giác");
        }
    }

    public static boolean checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        //  TriangleCheckedException checkedException  = new TriangleCheckedException();
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh tam gíac phải lớn hơn 0");
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalTriangleException("Tổng độ dài 2 cạnh phải lớn hơn cạnh còn lại");
        }
        System.out.printf("3 cạnh %s, %s, %s là 3 cạnh của 1 tam giác \n", a, b, c);
        return true;
    }
}
