//********** Print the given Pattern ***********
//A A A A A
//2 2 2 2
//C C C
//4 4
//E

package Loops.Pattern;

import java.util.Scanner;

public class Que_15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();

        for (int i =1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                if (i%2==0){
                    System.out.print(i+(" "));
                }else{
                    System.out.print((char)(i+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
