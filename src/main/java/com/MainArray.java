package com;

import java.util.Arrays;
import java.util.Comparator;

public class MainArray {
    public static void main(String[] args) {
        Integer[] array = {33,22,11,77,66,99};
        Arrays.sort(array, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Arrays.sort(array,((o1, o2) -> {
            return o1 - o2;
        }));
        Arrays.sort(array,(o1,o2)->o1-o2);
        System.out.println(Arrays.toString(array));
    }
}
