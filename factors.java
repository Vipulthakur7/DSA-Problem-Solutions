import java.util.Scanner;

public class factors{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number whose factor need to be printed");
        int n = input.nextInt();
        System.out.println("factor of given number is");
        for (int i = 1; i <= n; i++)
        {
            if(n%i==0)
            System.out.println(i);
        }
        input.close();
    }
}