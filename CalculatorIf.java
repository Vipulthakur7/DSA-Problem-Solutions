import java.util.Scanner;

public class CalculatorIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter 2nd number");
        int num2 = input.nextInt();
        System.out.println("enter operator (*,/,+,-)");
        char c=input.next().charAt(0);
        int result = 0;
        boolean isvalidoperation = true;
        if(c=='*')
        {
             result = num1 * num2;
        }
        else if(c=='/')
        {
            if(num2 != 0)
            {
            result = num1/num2;
            }
            else
            {
            System.out.println("division by zero not allowed");
            isvalidoperation = false;
            }
        }
        else if (c=='+')
        {
            result = num1 + num2;
        }
        else if(c=='-')
        {
            result = num1 - num2;

        }

        else {
            System.out.println("invalid operator entered");
            isvalidoperation = false;
        }
        if(isvalidoperation)
        System.out.println("given result is " + result);


    }
    
}
