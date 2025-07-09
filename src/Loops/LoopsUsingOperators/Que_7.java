//********** Write a program to print the sum of  a given numbers and its reverse  **********

package Loops.LoopsUsingOperators;

import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int original_num = num;

        int reversed_number = 0;
        while (num!=0){
            int last_digit = num%10;
            reversed_number = (reversed_number*10)+last_digit;

            num = num/10;
        }
        System.out.println(reversed_number);

        int sum = (original_num+reversed_number);
        System.out.println(sum);
    }
}
