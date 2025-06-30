//********** Check if AREA of rectangle is greater than parameter **********
package Conditional;

import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter breadth of Rectangle");
        int breadth  = sc.nextInt();
        System.out.println("Enter breadth of Rectangle");
        int length = sc.nextInt();

        int area =length*breadth;
        System.out.println("Area of Rectangle is: " + area);
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter of Rectangle is: " + perimeter);

        if(area > perimeter){
            System.out.println("Area is greater than perimeter");
        }
        else if(area == perimeter){
            System.out.println("Both Area and Perimeter are equal");
        }
        else {
            System.out.println("Perimeter is greater than Area");
        }
    }
}
