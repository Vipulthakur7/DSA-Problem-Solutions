import java.util.Scanner;

public class PrefixSumRangeQuery{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 10,20,30,40 };
        System.out.println("enter query range");
        int range1 = input.nextInt();
        int sum = 0;
        System.out.println("enter query range");
        int range2 = input.nextInt();
        for(int i=1;i<arr.length;i++)
        {
            arr[i] = arr[i - 1] + arr[i];

        }
        sum = arr[range2] - arr[range1];
        System.out.println("given query range is " + sum);





        // for (int i : arr)  here i is not index its value 
        // {
        //     System.out.print(i + " ");
        // }
    }
}