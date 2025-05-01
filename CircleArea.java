import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius of circle whose area need to be calculated");
        double radius=input.nextInt();
        double area=Math.PI*radius*radius;//in place of PI we can use 3.14
        System.out.println("Area of given circle is " + area);
    }
}
