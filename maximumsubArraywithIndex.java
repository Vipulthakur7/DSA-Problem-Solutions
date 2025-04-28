import java.util.Scanner;

public class maximumsubArraywithIndex {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int arr[] = { 5, -2, 6, -1, 4, -7, 2 };
        int length = arr.length;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempstart = 0;
        for(int i=0;i<length;i++)
        {
            sum = sum + arr[i];
            
            if (sum > maxsum)
            {
                maxsum = sum;
                end = i;
                start = tempstart;
            }
            



            if (sum < 0) {
                sum = 0;
                tempstart = i + 1;
            }
        }
        System.out.println("maximum sub array sum is " + maxsum + " starting index " + start + " ending index " + end);


    }
}