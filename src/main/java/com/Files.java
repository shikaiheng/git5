package com;

public class Files {
    @FunctionalInterface
    public interface Filter{
        boolean accept(String filename);
    }
    public static String[] getAllFilenames(String dir,Filter filter){
        //先获取，dir文件夹下的所有文件名
        String[] allFilenames = {};

        //2.进行过滤
        for(String filename : allFilenames){
            if(filter.accept(filename)){
                //将这个文件名装起来
            }
        }
        //3.返回所有装起来的文件名
        return null;
    }
}
