package day11;

import static java.lang.Thread.sleep;

public class Practise3 {
    boolean isPing = true;
    public synchronized void ping() throws InterruptedException {
        if (!isPing){
            wait();
        }
        System.out.println("Ping");
        isPing=false;
        notify();
    }

    public synchronized void pong() throws InterruptedException{
        if(isPing){
            wait();
        }
        System.out.println("Pong");
        isPing = true;
        notify();
//        wait();
    }

    public static void main(String[] args) {
        Practise3 p = new Practise3();
        Thread t1 = new Thread(()->{
            try {
                for (int i=0;i<10;i++){
                    p.ping();
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t2 = new Thread(()->{
            try{
                for (int i=0;i<10;i++){
                    p.pong();
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        });
        t1.start();
        t2.start();
    }
}
