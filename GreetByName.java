import java.util.Scanner;

public class GreetByName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        // String fname = input.next();vipuyl
        System.out.println("Hello " + name + " you are most welcome");
        input.close();
    }
}
