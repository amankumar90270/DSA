//********** Take 3 Positive integer input and print the greatest of of them **********
package Conditional;

import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter Num 1 ");
        num1 = sc.nextInt();

        System.out.println("Enter Num 2 ");
        num2 = sc.nextInt();

        System.out.println("Enter Num 3 ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is Greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is Greatest");
        } else{
            System.out.println(num3 + " is Greatest ");
        }

    }

}
