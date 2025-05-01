import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter length of triangle");
        double h=input.nextDouble();
        System.out.println("enter breadth of traingle");
        double b=input.nextDouble();
        double area = h * b;
        System.out.println("area of given Rectangle is " + area);
    }
}
