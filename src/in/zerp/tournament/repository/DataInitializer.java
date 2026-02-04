package in.zerp.tournament.repository;

import in.zerp.tournament.*;
import in.zerp.tournament.models.Address;
import in.zerp.tournament.models.Arena;
import in.zerp.tournament.models.Audiance;
import in.zerp.tournament.models.Player;
import in.zerp.tournament.models.PlayerType;
import in.zerp.tournament.models.Refree;
import in.zerp.tournament.models.ShuttleCock;
import in.zerp.tournament.models.ShuttleRacket;
import in.zerp.tournament.models.Ticket;
import in.zerp.tournament.service.*;

import java.util.ArrayList;
import java.util.Arrays;

public class DataInitializer {

    public static void initialize(TournamentService service) {
        Address a1 = new Address("RS Puram", "Coimbatore", "India", "TN", 10);
        Address a2 = new Address("Adyar", "Chennai", "India", "TN", 25);
        Address a3 = new Address("Indira Nagar", "Bangalore", "India", "KA", 5);
        Address a4 = new Address("Gachibowli", "Hyderabad", "India", "TS", 102);
        Address a5 = new Address("Bandra", "Mumbai", "India", "MH", 88);
        service.addressList.addAll(Arrays.asList(a1, a2, a3, a4, a5));
        
        ShuttleRacket r1 = new ShuttleRacket("Yonex Astrox", 83.0, "Head Heavy", "Stiff", "Isometric");
        ShuttleRacket r2 = new ShuttleRacket("Li-Ning Turbo", 87.0, "Even", "Flexible", "Isometric");
        ShuttleRacket r3 = new ShuttleRacket("Victor Thruster", 85.0, "Head Heavy", "Medium", "Oval");
        ShuttleRacket r4 = new ShuttleRacket("Yonex Nanoflare", 78.0, "Head Light", "Stiff", "Isometric");
        ShuttleRacket r5 = new ShuttleRacket("AuraSpeed", 82.0, "Even", "Stiff", "Isometric");
        service.racketList.addAll(Arrays.asList(r1, r2, r3, r4, r5));

        ShuttleCock c1 = new ShuttleCock(77, "Feather", 2);
        ShuttleCock c2 = new ShuttleCock(78, "Feather", 3);
        ShuttleCock c3 = new ShuttleCock(75, "Nylon", 1);
        ShuttleCock c4 = new ShuttleCock(77, "Nylon", 2);
        ShuttleCock c5 = new ShuttleCock(76, "Feather", 2);
        service.shuttleCockList.addAll(Arrays.asList(c1, c2, c3, c4, c5));

        Player p1 = new Player(a1, 101, r1, 2000, PlayerType.SINGLE, 24, "Indian", 178, "Arjun");
        Player p2 = new Player(a2, 102, r2, 1950, PlayerType.SINGLE, 22, "Indian", 182, "Siddharth");
        Player p3 = new Player(a3, 103, r3, 1800, PlayerType.DOUBLE, 26, "Indian", 175, "Karthik");
        Player p4 = new Player(a4, 104, r4, 1850, PlayerType.DOUBLE, 25, "Indian", 180, "Varun");
        Player p5 = new Player(a5, 105, r5, 2100, PlayerType.SINGLE, 23, "Indian", 177, "Pranav");
        service.playerList.addAll(Arrays.asList(p1, p2, p3, p4, p5));

        service.refreeList.add(new Refree(10, 150, 45, "Indian", 170, "Ravi Kumar"));
        service.refreeList.add(new Refree(5, 60, 38, "Indian", 175, "Anitha"));
        service.refreeList.add(new Refree(12, 200, 50, "Indian", 168, "John Doe"));
        service.refreeList.add(new Refree(3, 30, 30, "Indian", 180, "Suresh"));
        service.refreeList.add(new Refree(8, 120, 42, "Indian", 172, "Meena"));

        service.arenaList.add(new Arena(a1, new ArrayList<>(), 1000, "Nehru Stadium", c1));
        service.arenaList.add(new Arena(a2, new ArrayList<>(), 500, "Elite Court", c2));
        service.arenaList.add(new Arena(a3, new ArrayList<>(), 800, "Smash Hub", c5));
        service.arenaList.add(new Arena(a4, new ArrayList<>(), 1200, "Gachibowli Indoor", c1));
        service.arenaList.add(new Arena(a5, new ArrayList<>(), 300, "Mumbai Club", c3));

        System.out.println(">>> 5 Records for each category have been initialized successfully! <<<\n The Categories are : ");

    	System.out.println("Address\nShuttleRacket\nShuttleCock\nPlayer\nRefree\nArena");
    	
    	
    	
    }
    public static void initializeTickets(TicketManager ticketManager) {
    	
        Address addr1 = new Address("Anna Nagar", "Chennai", "India", "TN", 101);
        Audiance aud1 = new Audiance(addr1, 25, "Indian", 175, "Surya");
        Audiance aud2 = new Audiance(addr1, 30, "Indian", 165, "Priya");
        Audiance aud3 = new Audiance(addr1, 22, "Indian", 180, "Rahul");
        Audiance aud4 = new Audiance(addr1, 28, "Indian", 160, "Anitha");
        Audiance aud5 = new Audiance(addr1, 35, "Indian", 172, "Vikram");

        Ticket t1 = new Ticket(1001, "2026-03-10", 12, 1, "National Arena", 80.0, aud1);
        Ticket t2 = new Ticket(1002, "2026-03-10", 13, 1, "National Arena", 80.0, aud2);
        Ticket t3 = new Ticket(1003, "2026-03-11", 5, 2, "Elite Court", 80.0, aud3);
        Ticket t4 = new Ticket(1004, "2026-03-11", 6, 2, "Elite Court", 80.0, aud4);
        Ticket t5 = new Ticket(1005, "2026-03-12", 44, 5, "Smash Hub", 80.0, aud5);

        ticketManager.ticketList.addAll(Arrays.asList(t1, t2, t3, t4, t5));

        System.out.println(">>> 5 Tickets have been initialized for testing! <<<");
    }
}