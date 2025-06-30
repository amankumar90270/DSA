//********** Take  3 Positive integer input and  tell if they can be side of a triangle**********
package Conditional;

import java.util.Scanner;

public class Que_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Side");
        int first_side = sc.nextInt();
        System.out.println("Enter Second Side");
        int second_side = sc.nextInt();
        System.out.println("Enter Third Side");
        int third_side = sc.nextInt();

        if ( first_side < (second_side+third_side) && second_side < (first_side+third_side) && third_side < (first_side+second_side)){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
