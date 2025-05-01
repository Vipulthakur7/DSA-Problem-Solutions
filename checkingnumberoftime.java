import java.util.Scanner;

public class checkingnumberoftime {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sn.nextInt();
        int [] arr = new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++)
        {
        arr[i]=sn.nextInt();
        }
        System.out.println("enter the number which need to be find and its count");
        int m=sn.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(m==arr[i])
            count++;
        }
        System.out.println("number of times " + m + " appears is " + count);
        
    }
}
