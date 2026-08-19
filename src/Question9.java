import java.util.*;

public class Question9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to check it is palindrome or not: ");
        int num = input.nextInt();

        input.close();

        int user = num;

        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        if  (user == rev) {
            System.out.println(user + " is a palindrome");
        }

        else {
            System.out.println(user + " is not a palindrome");
        }
    }

}
