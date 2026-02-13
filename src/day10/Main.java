package day10;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass t1 = new ThreadClass();
        MyRunnable r1 = new MyRunnable();
//        r1.run();
//        If you call run() directly on your Runnable object, it runs in the same thread (main thread) just like any other method call. To make it asynchronous (run in the background), you must call the start() method, which belongs to the Thread class.
        Thread t2 = new Thread(r1);
//        theardInterrupt.start();//can be called only once
//        theardInterrupt.start();//.IllegalThreadStateException
//        t2.start();
//    theardInterrupt.join();
//        t2.join();
//        System.out.println(Thread.currentThread().getName()); // main
//        System.out.println(Thread.currentThread().getPriority());// 5
//        System.out.println("before the main Print statement");
//
//        theardInterrupt.start();
//        t2.start();
//        theardInterrupt.join();//theardInterrupt.join(2000) means give time to say I will wait for you for 2 seconds. If you aren't done by then, I'm moving on without you
//        t2.join();
//
//        System.out.println("the main Print statement");


//        ThreadFun tf = new ThreadFun();
//        Thread theardInterrupt = new Thread(tf.theardInterrupt);
//        theardInterrupt.start();


//        DOING THIS RESULTS IN MAIN THREAD GOING TO SLEEP DUE TO COFFEE.ASK();
//        RESULTS IN INDEFINITE WAITING
//        Coffee coffee = new Coffee();
//        coffee.ask();
//        coffee.make();
//
//        Thread t3 = new Thread(()->{
////            System.out.println("Asking coffee");
////            System.out.println("Coffee not there going to prepare");
//            coffee.ask();
//        });
//        Thread t4 = new Thread(()->{
//            try{
//                coffee.make();
//            } catch (InterruptedException e) {
//                System.out.println(e.getCause());
//            }
//        });
//        t3.start();
//        t4.start();
//        t3.join();
//        t4.join();
//
//        // with join it executes later after making the coffee or its the 1st line of execution due main thread and others have to wait 2sec
//        for (int i = 0; i < 10; i++) {
//            System.out.println("without join");
//        }

        ThreadClass tc1 = new ThreadClass();
        ThreadClass tc2 = new ThreadClass();
//        ThreadClass tc3 = new ThreadClass(
//       );
//        ThreadClass tc4 = new ThreadClass();
//        tc1.start();
//        theardInterrupt.start();
//        tc2.start();
//        tc3.start();
//        tc4.start();

//        ######utility

//        System.out.println("Current Thread : "+Thread.currentThread());
//        System.out.println("Thread Name : "+tc1.getName());
//        tc1.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("Get priority : "+tc1.getPriority());
//        System.out.println("Get state"+tc1.getState());
//        System.out.println("IsAlive : "+tc1.isAlive());
////        Current Thread : Thread[#1,main,5,main]
////        Thread Name : Thread-2
////        Get priority : 10
////        Get stateNEW
////        IsAlive : false


        Thread theardInterrupt = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Working...");
            }
            System.out.println("Thread stopped gracefully via interrupt!");
        });


        theardInterrupt.start();
        Thread thread1 = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });
        t1.start();
        theardInterrupt.join();
        t1.join();
        theardInterrupt.interrupt();




    }
}
