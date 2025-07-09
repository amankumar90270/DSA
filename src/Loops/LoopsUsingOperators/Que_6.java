//********** Write a program to print reverse of a given numbers **********

package Loops.LoopsUsingOperators;

import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int reversed_num =0;
        while(num!=0){
            int last_digit = num%10;
            reversed_num = (reversed_num*10)+last_digit;//multiply 10 with reversed number and add last_digit e.g= 1234 =  4*10=40+3=43*10=430+2=432*10=4321
            num = num/10;
        }
        System.out.println(reversed_num);
    }

    public static class Que_5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            int sum = 0;

            while (num!=0){
                int last_digit = num%10; //give last digit
                if(last_digit%2 ==0){
                    sum = sum+last_digit;//add last digit in sum
                }
                else{
                    System.out.print("");
                }
                num/=10; //remove last digit of num
            }
            System.out.println(sum);
        }
    }
}
