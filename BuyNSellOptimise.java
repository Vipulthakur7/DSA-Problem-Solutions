import java.util.*;

public class BuyNSellOptimise 
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array for stock price ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int profit = 0;
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++)
        {
            if (arr[i] < minprice)
                minprice = arr[i];
            else {
                profit = arr[i] - minprice;
                maxprofit = Math.max(profit, maxprofit);

            }
        }
        System.out.println("Maximum profit for the given array is: " + maxprofit);

        input.close();

    }
}
