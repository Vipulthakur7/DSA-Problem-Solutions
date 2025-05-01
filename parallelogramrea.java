import java.util.Scanner;

public class parallelogramrea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter length of parallelogram");
        double h=input.nextDouble();
        System.out.println("enter base of parallelogram");
        double b=input.nextDouble();
        double area = h * b;
        System.out.println("area of given parallelogram is " + area);
    }
}
