package Basics_and_Control_Structures;

import java.util.*;

public class Question5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the n term: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++ )
        {
            System.out.print(a+ " ");
            int c = a + b;
            a = b;
            b = c;
        }

        scanner.close();

    }

}