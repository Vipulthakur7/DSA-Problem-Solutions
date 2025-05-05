import java.util.Scanner;

public class perimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius of given circle whose perimeter need to be calculated ");
        double radius = input.nextDouble();
        double perimeter = Math.PI * 2 * radius;
        // System.out.println("perimeter of given circle is " + perimeter);
        System.out.printf("Perimeter of the given circle is: %.4f%n", perimeter);
        input.close();
    }
}
