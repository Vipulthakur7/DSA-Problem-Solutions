import java.util.HashMap;
import java.util.Scanner; 

public class Twosum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();
        boolean foundSolution = false;
        for (int i = 0; i < n; i++) {
            int currentNum = arr[i];
            int complement = target - currentNum;
            if (numMap.containsKey(complement)) {
                System.out.println("Found two numbers that sum to " + target + ":");
                System.out.println("Indices: [" + numMap.get(complement) + ", " + i + "]");
                System.out.println("Numbers: [" + complement + ", " + currentNum + "]");
                foundSolution = true;
                break; 
            }
            numMap.put(currentNum, i);
        }
        if (!foundSolution) {
            System.out.println("No two numbers found that sum to " + target + ".");
        }
        scanner.close();
    }
}
