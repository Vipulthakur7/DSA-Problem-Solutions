import java.util.Scanner;

public class findindcountinnumber {
//4567890678
//7
// value=n%10
// n=n/10;
public static void main(String[] args) {
    Scanner sn=new Scanner(System.in);
    System.out.println("enter the number ");
    long n=sn.nextLong();
    System.out.println("enter the number to be checked");
    int m=sn.nextInt();
    int count=0;
    while(n>0)
    {
       if(m==(n%10))
        count++;
        n=n/10;
    }
    System.out.println("number of time " + m + " appears is " + count);
}

    
}
