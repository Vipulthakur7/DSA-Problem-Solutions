import java.util.Scanner;

public class IsoscelesArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter length of triangle");
        double h=input.nextDouble();
        System.out.println("enter breadth of traingle");
        double b=input.nextDouble();
        double area = 0.5 * h * b;
        System.out.println("area of given Isosceles Rectangle is " + area);
    }
}
