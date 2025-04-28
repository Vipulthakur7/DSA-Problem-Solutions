import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number need to be checked for armstrong");
        int n = input.nextInt();
        System.out.println("enter the number upto where you need to check for armstrong");
        int last= input.nextInt();
        for(int i=n;i<=last;i++)
        {
        int sum = 0;
        int temp = i;
        int originalnumber=i;
        int digit=String.valueOf(temp).length();
        // System.out.println(digit); 153
        while(temp>0)
        {
           int l=temp%10; 
            sum=sum+(int)Math.pow(l,digit);
            temp=temp/10;

        }
        if(sum==originalnumber)
        System.out.println("given number is armstrong" + originalnumber);
        
    }
    input.close();
}
    
}
