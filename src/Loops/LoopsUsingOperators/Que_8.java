//********** Write a program to print the factorial of  a given number n  **********

package Loops.LoopsUsingOperators;

import java.util.Scanner;

public class Que_8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i =1; i<=num; i++){
             factorial = factorial*i;
        }
            System.out.println(factorial);

    }
}
