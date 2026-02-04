package in.zerp.tournament.models;

import java.util.*;
import in.zerp.tournament.repository.*;
import in.zerp.tournament.service.*;
public class Main{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("----------BADMINTON TOURNAMENT-------------");
        System.out.println("Admin or Bookticket");
        System.out.println("Press 1 for admin");
        System.out.println("Press 2 for Ticket booking");
        int adminTrue = sc.nextInt();
        if(adminTrue == 1){
            boolean running = true;
            TournamentService tournamentService = new TournamentService();
            DataInitializer.initialize(tournamentService);
            while(running){
                System.out.println("\t\t----------ADMIN------------");
                System.out.println("Press Respective Numbers\n\n");
                System.out.println("1) Add Players");
                System.out.println("2) Add Refree");
                System.out.println("3) Add Match Manually ");
                System.out.println("4) Add Team");
                System.out.println("5) Add Arena");
                System.out.println("6) Exit");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        tournamentService.addPlayer();
                        break;
                    case 2:
                        tournamentService.addRefree();
                        break;
                    case 3:
                        tournamentService.addMatch();
                        break;
                    case 4:
                        tournamentService.addTeam();
                        break;
                    case 5:
                        tournamentService.addArena();
                        break;
                    case 6:
                        running=false;
                        break;        
                    default:
                        System.err.println("Invalid Choice Try Again!!");
                        break;                
                }
            }
        }
        else{
            boolean running = true;
            TicketManager ticketManager = new TicketManager();
            DataInitializer.initializeTickets(ticketManager);
            while(running){
                System.out.println("\t\t----------TICKET BOOKING------------");
                System.out.println("Press Respective Numbers\n\n");
                System.out.println("1) Book Ticket");
                System.out.println("2) View Tickets");
                System.out.println("3) Exit");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        ticketManager.createTicket();
                        break;
                    case 2:
                        ticketManager.showTicket();
                        break;
                    case 3:
                        running = false;
                        break; 
                    default:
                        System.out.println("Invalid Entry !!");                      
                    }

                }
            }
        
    }
    
}