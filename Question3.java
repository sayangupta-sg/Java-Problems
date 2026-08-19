import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        double num2 = scanner.nextInt();

        System.out.println("Enter the third number");
        double num3 = scanner.nextInt();

        double largest;

        scanner.close();

        if (num1 > num2 && num1 > num3)
        {
            largest = num1;
        }

        else if (num2 > num1 && num2 > num3)
        {
            largest = num2;
        }

        else
            largest = num3;

        System.out.println(largest+" is the largest among 3 numbers");



    }

}
