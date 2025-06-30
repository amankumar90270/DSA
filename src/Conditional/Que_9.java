//********** Take Positive integer input and tell if it is divisible by 5 and 3 **********
package Conditional;

import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive integer");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by 5 and 3");
        } else if (num % 3 == 0) {
            System.out.println(num + " is not divisible by  3");
        } else if (num % 5 == 0) {
            System.out.println(num + " is  divisible by 5");
        } else {
            System.out.println(num + " is not divisible by 5 and 3");
        }
    }
}
