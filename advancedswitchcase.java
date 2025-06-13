import java.util.*;
public class advancedswitchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter sports name");
        String sports = input.nextLine();
        switch (sports) {
            case "cricket" -> System.out.println("this is my favourite sports");
            case "football" -> System.out.println("i used to play in school");
            case "uno" -> System.out.println("best indoor game ");
            default -> System.out.println("sports mentioned i dont like");
        }
        input.close();
    }
}
