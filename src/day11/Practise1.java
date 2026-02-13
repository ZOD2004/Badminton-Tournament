package day11;

public class Practise1 {

    int balance = 1000;

    public void withDraw(){
        this.balance-=100;
    }

    public void deposit(){
        this.balance+=100;
    }

    public int getBalance() {
        return this.balance;
    }

    public static void main(String[] args) throws InterruptedException {
        Practise1 p = new Practise1();
        Thread t1 = new Thread(()->{
            for(int i=0;i<100;i++){
                synchronized (p){
                    p.withDraw();
                }
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<100;i++){
                synchronized (p){
                    p.deposit();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(p.getBalance());

    }
}
