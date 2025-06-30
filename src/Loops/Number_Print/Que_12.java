package Loops.Number_Print;

import java.util.Scanner;

public class Que_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number To add");
        int n = sc.nextInt();
        int sum =0;

        while (n!=0){
            int last_digit =n%10;
            sum += last_digit;
            n/=10;
        }
        System.out.println(sum);
    }

}
