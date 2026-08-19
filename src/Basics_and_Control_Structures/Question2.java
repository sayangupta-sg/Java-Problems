import java.util.*;

public class Question2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first number: ");
        int num2 = scanner.nextInt();

        int num3 = num1 + num2;

        scanner.close();

        System.out.println(num1+ " + " +num2+ " = " +num3);

    }

}