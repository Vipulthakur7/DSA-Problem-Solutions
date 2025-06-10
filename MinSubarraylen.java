import java.util.Scanner;

public class MinSubarraylen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 4, 2, 6, 3, 7, 3, 0 };
        System.out.println("enter the sum ");
        int desiredsum = input.nextInt();
        int start = 0;
        int minlen = 0;
        int sum = 0;
        for (int end = 0; end < arr.length; end++)
        {
            sum = sum + arr[end];

            while (sum >= desiredsum) {
                minlen = Math.min(minlen, end - start + 1);
                sum = sum - arr[start];
                start++;

            }
        }
        
        System.out.println("minimum sub array length with sum >= " + minlen);
        input.close();
        

    }
}