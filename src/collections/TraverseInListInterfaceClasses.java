package collections;

import java.util.*;

public class TraverseInListInterfaceClasses {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);

        //linkedList
        List<Integer> arr1 = new LinkedList<>();
        arr1.add(1234);

        //using for loop
        for(int i:arr){
            System.out.println(i);
        }
        //using iterator
        Iterator<Integer> iterator =  arr1.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //vector - as it is synchronized, thread safe
        Vector<Integer> vectorArr = new Vector<>();
        vectorArr.add(12345);

        for(int i : vectorArr){
            System.out.println(i);
        }


    }
}
