package Loops.Number_Print;

import java.util.Scanner;

public  class Que_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Which you want a table");
        int num = sc.nextInt();

        for (int i = 1; i<=10; i++){

            int table  = num*i;
            System.out.println(table);
        }

    }
}
