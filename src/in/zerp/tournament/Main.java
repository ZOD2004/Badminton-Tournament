package in.zerp.tournament;

import java.util.*;
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
            while(running){
                System.out.println("----------ADMIN------------");
                System.out.println("Press Respective Numbers");
                System.out.println("1) Add Players");
                System.out.println("2) Add Refree");
                System.out.println("3) Add Match");
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
            
        }
        
    }
    
}