package in.zerp.tournament;


//import java.util.ArrayList;
import java.util.*;

class TicketManager{
 public List<Audiance> audiancesList = new ArrayList<>();
 public List<Ticket> ticketList = new ArrayList<>();
 public List<Address> addressList = new  ArrayList<>();
 public static void main(String[] args) {
     boolean running = true;
     Scanner sc = new Scanner(System.in);
     while(running){
         System.out.println("----------TICKET BOOKING------------");
         System.out.println("Press Respective Numbers");
         System.out.println("1) Add Audiance");
         System.out.println("2) Book Ticket");
         System.out.println("3) Add Address");
         int choice = sc.nextInt();
         switch(choice){
             case 1:
                 break;
             case 2:
                 break;
             case 3:
                 break;                   
         }
     }
 }
}
