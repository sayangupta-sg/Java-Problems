import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int prime=0;
        for (int i = 1; i<=num; i++)
        {

            if (num % i == 0)
            {
                prime ++;
            }
        }

        if (prime == 2)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");

        scanner.close();
    }
}
		