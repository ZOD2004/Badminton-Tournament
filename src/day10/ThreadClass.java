package day10;

public class ThreadClass extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("ThreadClass is running...");
        }
        for(int i=0;i<5;i++){
            System.out.println("The counter = "+i);
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
