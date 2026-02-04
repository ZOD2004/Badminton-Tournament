//package service;
package in.zerp.tournament.service;

//import java.util.ArrayList;
import java.util.*;

import in.zerp.tournament.models.Address;
import in.zerp.tournament.models.Audiance;
import in.zerp.tournament.models.Ticket;

public class TicketManager{
 public List<Ticket> ticketList = new ArrayList<>();
 Scanner sc = new Scanner(System.in);
 public Address createAddress(){
         System.out.println("area");
         String areaChoice = sc.next();
         System.out.println("city");
         String cityChoice = sc.next();
         System.out.println("country");
         String countryChoice = sc.next();
         System.out.println("district");
         String districtChoice = sc.next();
         System.out.println("dno");
         int dnoChoice = sc.nextInt();
         return new Address(areaChoice, cityChoice, countryChoice, districtChoice, dnoChoice);
 }
 
 public void createTicket() {

     System.out.println("Stadium name");
     String stadiumName = sc.next();

     System.out.println("Ticket ID");
     int ticketId = sc.nextInt();

     System.out.println("date");
     String date = sc.next();

     System.out.println("price");
     double price = sc.nextDouble();

     System.out.println("row");
     int row = sc.nextInt();

     System.out.println("seat number");
     int seatNum = sc.nextInt();

     System.out.println("Enter Audiance Detail : ");
     Audiance audiance = createAudiance();
     Ticket tic = new Ticket(ticketId,date,seatNum,row,stadiumName,price,audiance);
     ticketList.add(tic);
 }

 public void showTicket() {
	 if(ticketList.size()==0) {
		 System.out.println("There are No Tickets Booked YET");
	 }
     int count = 1;
     for (Ticket t : ticketList) {
         System.out.println(count + "  " + t.toString());
         count++;
     }
 }


 public Audiance createAudiance(){
     Address audianceAddress;
     audianceAddress = createAddress();
     System.out.println("Age : ");
     int age = sc.nextInt();
     System.out.println("ethinicity : ");
     String ethinicity = sc.next();
     System.out.println("Height : ");
     int height = sc.nextInt();
     System.out.println("Name : ");
     String name = sc.next();
     return new Audiance(audianceAddress, age, ethinicity, height, name);
 }

}
