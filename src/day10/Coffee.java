package day10;
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
                System.out.println("Ready");
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public synchronized void make(){
        System.out.println("Making coffee");
        isReady = true;
        notifyAll();
        System.out.println("Notified the ask method");
    }
}
