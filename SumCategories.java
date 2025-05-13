import java.util.*;
public class SumCategories{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter the number , enter (0 to stop)");
        int num;
        int negsum=0;
        int posevensum=0;
        int posoddsum=0;

        while (true) {
            num = sn.nextInt();
            if (num == 0)
                break;
            if (num < 0)
                negsum = negsum + num;
            else if (num > 0) {
                if (num % 2 == 0)
                    posevensum = posevensum + num;
                else {
                    posoddsum = posoddsum + num;
                }

            }
        }
        System.out.println("sum of negative number "+ negsum + " sum of postive even number " + posevensum + "sum of positive odd number " + posoddsum);
        sn.close();


    }
}