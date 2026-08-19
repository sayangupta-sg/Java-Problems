import java.util.Scanner;

public class Question7 {

    public static int factorial(int num) {

        if (num <= 1) {
            return 1;
        }

        return num * factorial (num - 1);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Fatorial of "+n+ " is "+factorial(n));


    }

}