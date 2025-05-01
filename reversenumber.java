import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        // 556789876
        //678987655
Scanner sn=new Scanner(System.in);
System.out.println("enter the number need to be reveresed");
int n=sn.nextInt();
System.out.println("Number after reversing");
int rem=0;
int res=0;
while(n>0)
// {
//     System.out.print(n%10);
//     n/=10;
// }
{
    rem=n%10;
    res=res*10+rem;
    n/=10;
}
System.out.println(res);
    }
}
