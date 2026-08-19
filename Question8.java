
import java.util.*;

public class Question8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        scanner.close();

        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;

        int sum = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);

        if (sum == num)
        {
            System.out.println(num+ " is a Armstrong number");
        }

        else
        {

            System.out.println(num+ " is not a Armstrong number");
        }

    }

}