package Conditional;
import  java.util.Scanner;
//---------- Take integar value and print absolute value of that integar
public class Que_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println(num*(-1));
        }else {
            System.out.println(num);
        }
    }
}
