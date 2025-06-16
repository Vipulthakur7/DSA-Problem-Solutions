public class BuildArrayFromPermutation{
    public static void main(String[] args) {
        int[] arr = { 3,1,0,2,4,5};
        int length = arr.length;
        int[] arr1 = new int[length];
        for(int i = 0 ; i<length;i++)
        {
            arr1[i] = arr[arr[i]];

        }
        for(int num : arr1)
        System.out.print(num);
    }
}