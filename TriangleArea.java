import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter height of triangle");
        double h=input.nextDouble();
        System.out.println("enter base of traingle");
        double b=input.nextDouble();
        double area = 0.5 * h * b;
        System.out.println("area of given traingle is " + area);
    }
}
