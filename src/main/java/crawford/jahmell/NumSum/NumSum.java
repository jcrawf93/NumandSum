package crawford.jahmell.NumSum;

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int aNumber = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= aNumber; i++) {
            sum = sum + i;
        }
        {
            System.out.print(sum);
        }

    }
}
