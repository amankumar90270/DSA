package Arrays;

import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter mark of Student");
//        int mark = sc.nextInt();
//
//        int []arr = new int[mark];

        int [] marks = {12,45,65,34,67,100,7};

        for(int i=0;i<marks.length; i++){
            if(marks[i] <= 35)
                System.out.println(i+"");
        }

    }
}
