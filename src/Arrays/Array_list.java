//********** Array List  **********

package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(12);
        arr.add(6);
        arr.add(18);
        arr.add(12);
        System.out.println(arr.get(3)); //to access array elements

        int n = arr.size();
        arr.set(3,50); //to change element
        System.out.println(arr.get(3));

        System.out.println(arr); //to print whole arraylist
        System.out.println(arr.remove(arr.size()-1)); //to remove last element



       // to access element in arraylist by loop
        for (int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+ "  ");
        }

        Collections.reverse(arr); //to reverse array
        System.out.println("Reverse Array: " + arr);


        //can use for each loop in arraylist as compare to array
        for (int ele: arr){
            System.out.print(ele +" ");
        }

    }
}