//********** Write a program to print sum of digits of given numbers **********
package Loops.LoopsUsingOperators;

import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int sum =0;
        while (num!=0){
            int last_digit = num%10;
            sum = sum+last_digit;
            num= num/10;
        }
        System.out.println(sum);
    }
}
