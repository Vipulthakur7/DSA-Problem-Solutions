import java.util.Scanner;

public class rhombusArea{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter 1st diagonal length");
        double d1 = sn.nextDouble();
        System.out.println("enter 2nd diagonal length");
        double d2 = sn.nextDouble();
        double area = 0.5 * d1 * d2;
        System.out.println("Area of given rhombus is " + area);


    }
}