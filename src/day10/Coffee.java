package day10;

import static java.lang.Thread.sleep;

// Should we whats wrong
//gets stuck
public class Coffee {
    Boolean isReady = false;
    public synchronized void ask(){
        while (!isReady){
            try{
                System.out.println("Waiting for the coffee to be ready");
                wait();
//                while (!isReady){
//                    System.out.println("Preparing");
//                }

            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Ready");
    }
    public synchronized void make() throws InterruptedException {
        System.out.println("Making coffee");
        isReady = true; // if not present gose to sleep again
        sleep(2000);
        notifyAll();
        System.out.println("Notified the ask method");
        System.out.println("Coffee served  ::  ");
    }
}
