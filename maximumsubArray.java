import java.util.Scanner;

public class maximumsubArray {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int arr[] = { 1, 3, -4, 2, -9, 4, 2, 0, -2 };
        int length = arr.length;
        int sum = 0;
        int maxsum = 0;
        for(int i=0;i<length;i++)
        {
            sum = sum + arr[i];
            if (sum > maxsum)
                maxsum = sum;

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("maximum sub array sum is " + maxsum);


    }
}