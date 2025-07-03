//********** Write a program to print reverse of given numbers **********

package Loops.Number_Print;

import java.util.Scanner;

public class Que_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int reverse_num = 0;

        while (n!=0){
            int last_num = n%10;
            reverse_num*=10;
            reverse_num+=last_num;
            n/=10;
        }
        System.out.println(reverse_num);



    }
}
