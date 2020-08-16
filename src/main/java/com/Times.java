package com;

public class Times {
    public interface Block{
        void execute() throws InterruptedException;
    }
    public static void test(Block block) throws InterruptedException {
        long begin = System.currentTimeMillis();
        block.execute();
        long end = System.currentTimeMillis();
        double duration  = (end - begin) / 1000.0;
        System.out.println("好事："+ duration +"s");
    }
}
