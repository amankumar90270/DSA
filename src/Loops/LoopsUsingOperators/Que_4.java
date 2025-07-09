//********** Write a program to print All non zero digits of given numbers **********

package Loops.LoopsUsingOperators;

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        while(num!=0){
            int last_digit = num%10; //remove last digit
            if (last_digit ==0){
                System.out.print("");
            }else{
                System.out.print(last_digit);
            }
            num = num/10;
        }

    }
}
