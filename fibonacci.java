import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number upto where you need fibonacci series");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        if(n<1)
        System.out.println("please enter positive number");
        if(n==1)
        System.out.print(first);
        else{
            System.out.print(first + " " + second + " ");
            for(int i =3; i<=n;i++)
            {
              int next = first + second;
              System.out.print(next + " ");  
              first = second;
              second=next;
            }
        }
        
        
    }
    
}
