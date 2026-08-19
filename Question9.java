import java.util.*;

public class Question9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int user = num;
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (user == rev) {
            System.out.println(user+ " is Palindrome");
        } else {
            System.out.println(user+ " is not palindrome");
        }
    }
}

