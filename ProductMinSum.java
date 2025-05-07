import java.util.*;
public class ProductMinSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number whose product min sum need to be find");
        int n = input.nextInt();
        int product = 1;//23456789
        int sum = 0;
        int temp;
        while(n>0)
        {
            temp = n % 10;
            n = n / 10;
            product = product * temp;
            sum = sum + temp;
        }
        System.out.println("product of given digit subtracting sum of digit is " + (product-sum));

    }
}