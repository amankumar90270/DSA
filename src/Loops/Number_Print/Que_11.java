//********** Write a program to check if a number is prime or not **********
package Loops.Number_Print;

import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean flag= false; //false means composite
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true; //true means prime
                break;
            }
        }
        if (flag == false){
            System.out.println("Composite");
        }else{
            System.out.println("Prime");
        }
    }
}
