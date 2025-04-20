import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter principal");
        double principal = input.nextDouble();
        System.out.println("enter time");
        double time = input.nextDouble();
        System.out.println("enter rate of interest");
        double rate = input.nextDouble();
        double simpleInterest = (principal * rate * time )/100;
        System.out.println("given simple interest " + simpleInterest);
        input.close();
    }
    
}
