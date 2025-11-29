package ControlFlow;
import java.util.Scanner;

public class GreatestFactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;  // default value

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {   // check perfect divisor
                greatestFactor = i;
                break;              // stop after finding the largest factor
            }
        }

        System.out.println("Greatest factor (other than the number itself): " + greatestFactor);

        sc.close();
    }
}
