import java.util.*;
public class sumofDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number whose sum of digit need to be find");
        int num = input.nextInt();
        int sumofDigit = 0;
        while (num != 0)
        {
            sumofDigit = sumofDigit + (num % 10);
            num = num / 10;
        }
        System.out.println("sum og given digit is " + sumofDigit);
        input.close();

    }
}
