import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string to be checked for palindrome");
        String paldrome=input.nextLine();  // aba
        String reverse="";
        for(int i=paldrome.length()-1;i>=0;i--)
        {
            reverse=reverse+paldrome.charAt(i);
        }
        if(reverse.equals(paldrome)) //if(reverse==paldrome) it will check for memory location 
        System.out.println("given string is palindrome");
        else
        System.out.println("given string is not palindrome");
    }
}
