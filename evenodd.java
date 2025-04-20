import java.util.Scanner;

public class evenodd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();
        if(number % 2 == 0)
        {
            System.out.println("given number is even");
        }
        else {
            System.out.println("given number is odd");
        }

    }
}