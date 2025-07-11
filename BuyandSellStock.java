import java.util.*;
public class BuyandSellStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=input.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array for stock price ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        int profit = 0;
        int currprofit = 0;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    currprofit = arr[j] - arr[i];
                    profit = Math.max(profit, currprofit);
                }

            }

        }
        System.out.println("Maximum profit for given array is: " +  profit);
        input.close();

    }
}
