public class maximumsubArraysizek {
public static void main(String[] args) {
    int arr[] = {2, 1, 5, 1, 3, 2};
    int k = 3;
    int sum = 0;
    int maxsum = 0;
    for(int i=0;i<k;i++)
    {
        sum = sum + arr[i];

    }
    maxsum = sum;
    for (int i = k; i < arr.length; i++)
    {
        sum = sum - arr[i - k] + arr[i];
        maxsum = Math.max(maxsum, sum);
    }

    System.out.println("maximum sum of subarray of size " + k + " is " + maxsum);

}
    
}
