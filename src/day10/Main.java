package day10;

import java.util.ArrayList;
import java.util.Vector;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass t1 = new ThreadClass();
        MyRunnable r1 = new MyRunnable();
//        r1.run();
//        If you call run() directly on your Runnable object, it runs in the same thread (main thread) just like any other method call. To make it asynchronous (run in the background), you must call the start() method, which belongs to the Thread class.
        Thread t2 = new Thread(r1);
//        t1.start();//can be called only once
//        t1.start();//.IllegalThreadStateException
//        t2.start();
//    t1.join();
//        t2.join();
//        System.out.println(Thread.currentThread().getName()); // main
//        System.out.println(Thread.currentThread().getPriority());// 5
//        System.out.println("before the main Print statement");
//
//        t1.start();
//        t2.start();
//        t1.join();//t1.join(2000) means give time to say I will wait for you for 2 seconds. If you aren't done by then, I'm moving on without you
//        t2.join();
//
//        System.out.println("the main Print statement");


//        ThreadFun tf = new ThreadFun();
//        Thread t1 = new Thread(tf.t1);
//        t1.start();

        Coffee coffee = new Coffee();
        coffee.ask();
        coffee.make();

    }
}
