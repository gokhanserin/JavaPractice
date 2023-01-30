package Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer element = it.next();
            if (element<4){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("------------------------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        list2.removeIf(p -> p<4);
        System.out.println("list2 = " + list2);

    }


}
