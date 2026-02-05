package in.zerp.tournament.models;

import in.zerp.tournament.repository.*;
import in.zerp.tournament.service.*;
import java.util.*;
public class Main{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("----------BADMINTON TOURNAMENT-------------");
        System.out.println("Admin or Bookticket");
        System.out.println("Press 1 for admin");
        System.out.println("Press 2 for Ticket booking");
        System.out.println("Press 3 to Play Match");
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
                System.out.println("3) Add Match Manually");
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
        else if(adminTrue == 2){
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
            else if(adminTrue == 3){
            System.out.println("1)Schedule Match");
    //		be sure to include 10 teams for each singles and doubles in datainitializer 
            //first split into doubles and singles
            //use heap after making it even
            //maintain a list and make sure to remove when match gets scheduled
            //be sure to change matchStatus
            System.out.println("2)View Scheduled Match");
            //just view purpose use only names
            System.out.println("3)Play Game for Scheduled Matchs");
            boolean running = true;
            while(running){
                System.out.println("1)SINGLES\n2)DOUBLES\nEXIT");
                MatchManager matchManager = new MatchManager();
                int playChoice = sc.nextInt();
                switch (playChoice) {
                    case 1:
                        System.out.println("Schedule Matches for single and Doubles ");
                        System.out.println("The entier list will be completely CLEARED");
                        break;
                    case 2:
                        System.out.println("PlayerType playerType,int mat,int t1score,int t2score");
                        System.out.println("Enter Player Type : ");
                        System.out.println("1)SINGLES\n2)DOUBLES");
                        int curr = sc.nextInt();
                        PlayerType pType;
                        if(curr == 1){
                            pType = PlayerType.SINGLE;
                        }
                        else{
                            pType = PlayerType.DOUBLE;
                        }
                        List<Match> list = matchManager.getListViaPLayerType(pType);
                        matchManager.viewScheduledMatches(list);
                        System.out.println("Select the Match number you want to Play: ");
                        int mat = sc.nextInt();
                        System.out.println("Enter Final Team 1 Score");
                        int tFinal1 = sc.nextInt();
                        System.out.println("Enter Final Team 2 Score");
                        int tFinal2 = sc.nextInt();
                        matchManager.playGame(pType,mat,tFinal1,tFinal2);
                        break;
                    case 3:
                        System.out.println("\t View Schduled Team : : ");
                        break;	
                    case 4:
                        running = false;
                        break;		
                    default:
                        System.out.println("Invalid Choice !!");
                }
            }
            //change the players internal values at last
            //make the winner to enter into schedule match list to repeate the process
            //while(size == 1) announce winner
            }
    
        
    }
    
}