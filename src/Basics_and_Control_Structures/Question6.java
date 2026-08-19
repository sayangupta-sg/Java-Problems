import java.util.*;

public class Question6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int f = 1;
        for (int i=1;i<=n;i++)
        {

            f =i * f;

        }
        System.out.println("The factorial of n is " +f);
        scanner.close();
    }

}
