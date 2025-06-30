//********** Take   Positive integer input and  tell if it is divisible by 5 or 3 but not divisible by 15**********
package Conditional;

import java.util.Scanner;

public class Que_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integar");
        int num = sc.nextInt();

        if (num % 5 == 0 || num % 3 == 0) {
            if (num % 15 != 0 )
                System.out.println(num + " is divisible by 3 or 5 but not 15");
        }else{
            System.out.println("Not matching required condition");
        }
    }
}
