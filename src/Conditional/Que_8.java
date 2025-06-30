//********** Take Positive integer input and tell if it is a three number or not **********
package Conditional;
import java.util.Scanner;
public class Que_8 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Positive integer Number");
        int num = sc.nextInt();

        if(num>99 && num<1000){
            System.out.println(num + " is a three digit");
        }else{
            System.out.println(num + " is not a three digit");
        }
    }

}
