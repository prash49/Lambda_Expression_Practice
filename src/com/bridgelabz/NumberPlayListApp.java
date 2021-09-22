package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class NumberPlayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        // For-Each method to Iterate
        for (Integer intList : list) {
            System.out.println(intList);
        }

        // Method1 using Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // method 2 using consumer
        MyConsumer obj2 = new MyConsumer();
        list.forEach(obj2);

        // Method 3  traversing with Anonymous Consumer interface implementation
        MyConsumer obj3 =new MyConsumer();
        list.forEach(new MyConsumer(){
            public void accept(Integer val) {
                System.out.println("Value: " + val);
            }
        });
        // method 4 Explicit lambda
        Consumer<Integer> myAction = n -> {
            System.out.println("Lambda List values:"+n);
        };
        list.forEach(myAction);

        // method 5 Implicit lambda function
        list.forEach(item -> System.out.println("Values in list"+item));

    }

    static class MyConsumer implements Consumer<Integer> {
        public void accept(Integer val) {
            System.out.println("Value: " + val);
        }
    }

}
