package com.netty.channelhander;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2020/12/25 16:26
 */

public class Test2 {

    private static final Semaphore SEMAPHORE = new Semaphore(10);
    private static final AtomicInteger SUCCESS = new AtomicInteger(0);
    private static final AtomicInteger FAIL = new AtomicInteger(0);

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            new Thread(() ->test()).start();
        }
    }

    public static boolean test(){
        if(!SEMAPHORE.tryAcquire()){
            System.out.println("fail" + ":" + FAIL.incrementAndGet());
            return false;
        }

        try {
            Thread.sleep(5000);
            System.out.println("success" + ":" + SUCCESS.incrementAndGet());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            SEMAPHORE.release();
        }
        return true;
    }

}
