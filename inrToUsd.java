import java.util.Scanner;

public class inrToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ₹ amount in inr which you want to convert in usd");
        Double n = input.nextDouble();
        n = n * 0.012;
        System.out.println("converted amount in  $ is " + n);
       input.close();
    }
}
