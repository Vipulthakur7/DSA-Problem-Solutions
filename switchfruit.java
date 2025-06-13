import java.util.Scanner;

public class switchfruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the fruit name");
        String fruit = input.nextLine();
        switch (fruit) {
            case "Mango":
                System.out.println("mango is king of summer fruits");

                break;

            case "banana":
                System.out.println("banana is best for fibre");
                break;

            case "orange":
                System.out.println("orange is best source of vi");
                break;

            default:
                System.out.println("fruit name not matched");
                break;
        }
        input.close();

    }
}