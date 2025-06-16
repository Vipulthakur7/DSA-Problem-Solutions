public class buildarrayfrmpermutationoptimize {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 3, 1, 0 };
        int n = arr.length;

        //encode both current and new value
        for(int i = 0;i<n;i++)
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        // extract new value
        for(int i=0;i<n;i++)
            arr[i] = arr[i] / n;

        // printing result
        for(int num : arr)
        System.out.print(num);
        
    }
}
