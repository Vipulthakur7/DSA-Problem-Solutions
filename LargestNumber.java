import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter 2nd number");
        int num2 = input.nextInt();
        if(num1 > num2)
        {
            System.out.println("largest number is " + num1);

        }
        else {
            System.out.println("largest number is " + num2);
        }
        input.close();
        
    }
    
    
}
