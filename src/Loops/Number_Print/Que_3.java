//********** Print all the numbers from 1 to 100 which are divisible by 3**********

package Loops.Number_Print;
public  class Que_3 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}


