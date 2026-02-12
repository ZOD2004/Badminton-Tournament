package day10;

public class ThreadFun{
    Runnable t1 = ()->{
      for(int i=0;i<20;i++){
          System.out.println("Functional Interface Thread t1..");
      }
    };

    public static void main(String[] args) {
        Thread th = new Thread();
        th.run();
    }

}

