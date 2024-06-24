//Levon Khachatryan
//COMP 282
//Project #1

import java.util.*;
public class RandomNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        //Add elements to list1
        Random r = new Random();
        for (int i =0;i<20;i++){
            list1.add(r.nextInt(99)+1);
        }
        
        System.out.println("Original list1 : " + list1);
        ListIterator<Integer> itr1 = list1.listIterator();
        int sum = 0;
        while(itr1.hasNext()){
            int num = itr1.next();
            sum = sum+num;
        }
        System.out.println("Average value of the list is: " +sum/20);

        ListIterator<Integer> itr2 = list1.listIterator();

        while( itr2.hasNext())
        {
        int x = itr2.next();
        //do something with x
        if ( x % 2 == 1)
        {
        itr2.remove();
        //removes the item returned by last next()
        }
        }
        System.out.println("Modified list1 : " + list1);
    }
}