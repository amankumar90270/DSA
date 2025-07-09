//********** Write a program to print product of digits of given numbers **********
package Loops.LoopsUsingOperators;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int multiply = 1;

        while(num!=0){
            int last_digit = num%10; //give last digit
            multiply *=last_digit; //count last digit
            num /=10; //remove last digit
        }
        System.out.println(multiply);
    }
}
