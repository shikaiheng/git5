package com;

import java.util.Arrays;

public class MainFiles {
    public static void main(String[] args) {
        Files.getAllFilenames("F:", new Files.Filter() {
            public boolean accept(String filename) {
                return filename.contains("类");
            }
        });
        /**
         * (参数列表)-> {
         *     return xxx;
         * }
         */
        Files.getAllFilenames("E:",filename->{
            return filename.contains("类");
        });

        Integer[] array = {33,22,11,77,66,99};

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
