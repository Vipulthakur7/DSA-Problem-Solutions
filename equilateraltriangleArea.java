import java.util.Scanner;

public class equilateraltriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter side of equilateral triangle");
        double side = input.nextDouble();
        // double area = (1.7320/4) * side * side;
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("area of given equilateral triangle " + area);
        // System.out.printf("Area of given equilateral triangle: %.4f%n" + area);
    }
}
