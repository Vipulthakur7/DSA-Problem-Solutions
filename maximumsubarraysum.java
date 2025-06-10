import java.util.*;
public class maximumsubarraysum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of sub array array");
        int length = input.nextInt();
        // System.out.println("enter array element");
        int[] arr = { 4, 7, 2, 5, 9, 2 };

        int maxsum = 0;
        int sum = 0;
       
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
        }
        maxsum = maxsum + sum;
        for (int i = length; i < arr.length; i++)
        {
            sum = sum - arr[i - length] + arr[i];
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println("Maximum sum of given element of ramge " + "length - " + maxsum);
        input.close();

    }
}