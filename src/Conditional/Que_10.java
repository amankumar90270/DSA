//********** Take Positive integer input and tell if it is divisible by 5 or 3 **********
package Conditional;

import java.util.Scanner;

public class Que_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if (num % 5 ==0 || num %3 ==0){
                System.out.println("Number is Divisible by 5 or 3 ");
            }else{
                System.out.println("Number is not divisible by 5 or 3");
            }
        }
    }
}
