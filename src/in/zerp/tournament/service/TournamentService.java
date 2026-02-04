package in.zerp.tournament.service;
import java.util.*;

import in.zerp.tournament.models.Address;
import in.zerp.tournament.models.Arena;
import in.zerp.tournament.models.Audiance;
import in.zerp.tournament.models.CourtDimentions;
import in.zerp.tournament.models.Match;
import in.zerp.tournament.models.MatchStatus;
import in.zerp.tournament.models.Player;
import in.zerp.tournament.models.PlayerType;
import in.zerp.tournament.models.Refree;
import in.zerp.tournament.models.ShuttleCock;
import in.zerp.tournament.models.ShuttleRacket;
import in.zerp.tournament.models.Team;
public class TournamentService{
    public  List<Player> playerList = new ArrayList<>();
    public  List<Refree> refreeList = new ArrayList<>();
    public  List<Match> matchList = new ArrayList<>();
    public  List<Arena> arenaList = new ArrayList<>();
    public  ArrayList<ShuttleRacket> racketList = new ArrayList<>();
    public  List<Address> addressList = new ArrayList<>();
    public  ArrayList<ShuttleCock> shuttleCockList = new ArrayList<>();
    public  List<Team>teamList =  new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    // Need for Address
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
    public Address showAddress(){
    	if(addressList.size() == 0) {
    		System.out.println("No Address is mentioned before");
    		return null;
    	}
    	System.out.println("Available Address : ");
        int count=1;
            for(Address i: addressList){
                System.out.println(count+"  "+i.toString());
                count++;
            }
            System.out.println("Enter the serial number as your choice : ");
            int addChoice = sc.nextInt();
            return addressList.get(addChoice-1);
    }
    //Need for Racket
    public ShuttleRacket createRacket() {
        System.out.println("make");
        String makeChoice = sc.next();

        System.out.println("weight");
        double weightChoice = sc.nextDouble();

        System.out.println("balance");
        String balanceChoice = sc.next();

        System.out.println("shaftStiffness");
        String shaftStiffnessChoice = sc.next();

        System.out.println("headShape");
        String headShapeChoice = sc.next();

        return new ShuttleRacket(makeChoice,weightChoice,balanceChoice,shaftStiffnessChoice,headShapeChoice);
    }

    public ShuttleRacket showRacket() {
    	if(racketList.size() == 0) {
    		System.out.println("No previous inserted Racket found. ");
    		return null;
    	}
    	System.out.println("Available Racket : ");
        int count = 1;
        for (ShuttleRacket r : racketList) {
            System.out.println(count + "  " + r.toString());
            count++;
        }
        
        System.out.println("Enter the show number as your choice");
        int racketChoice = sc.nextInt();
        return racketList.get(racketChoice - 1);
    }

    public Player createPlayer(){
        Address playerAddress;
        System.out.println("Select PlayerAddress : ");
        System.out.println("1) Add new address \n2)Use created Address");
        int playerAddressChoice = sc.nextInt();
        if(playerAddressChoice == 1){
            Address newAddress = createAddress();
            addressList.add(newAddress);
            playerAddress = showAddress();
        }
        else{
            playerAddress = showAddress();
        }

        System.out.println("Enter PlayerId");
        int playerId = sc.nextInt();

        System.out.println("Select Player racket");
        ShuttleRacket racket;
        System.out.println("racket");
        System.out.println("1)Add new racket \n2) Use old one");
        int racketChoice = sc.nextInt();

        if (racketChoice == 1) {
            ShuttleRacket newRacket = createRacket();
            racketList.add(newRacket);
            racket = showRacket();
        } else {
            racket = showRacket();
        }

        System.out.println("Enter Player ratings");
        int playerRating = sc.nextInt();

        System.out.println("Enter player playing type");
        PlayerType playerType;
        System.out.println("1) SINGLES");
        System.out.println("2) DOUBLES");
        int typeChoice = sc.nextInt();
        playerType = (typeChoice == 1)?PlayerType.SINGLE:PlayerType.DOUBLE;

        System.out.println("Enter Player's age");
        int age = sc.nextInt();

        System.out.println("Enter Player's ethnicity");
        String ethnicity = sc.next();

        System.out.println("Enter Player's height");
        int height = sc.nextInt();

        System.out.println("Enter Player's name");
        String name = sc.next();
        return new Player( playerAddress,playerId,racket,playerRating,playerType,age,ethnicity,height,name);
    }

    public void addPlayer(){

        Player newPlayer = createPlayer();
        playerList.add(newPlayer);
    }

    public Player showPlayer(){
    	if(playerList.size() == 0) {
    		System.out.println("Pls insert players first");
    		return null;
    	}
    	System.out.println("Available Players : :");
        int count = 1;
        for (Player a : playerList) {
            System.out.println(count + "  " + a.toString());
            count++;
        }
        System.out.println("Enter the show number as your choice");
        int playerChoice = sc.nextInt();
        return playerList.get(playerChoice - 1);
    }

    

    public void addRefree() {

        System.out.println("experience");
        int experience = sc.nextInt();

        System.out.println("totalMatchs");
        int totalMatchs = sc.nextInt();

        System.out.println("age");
        int age = sc.nextInt();

        System.out.println("ethnicity");
        String ethnicity = sc.next();

        System.out.println("height");
        int height = sc.nextInt();

        System.out.println("name");
        String name = sc.next();

        Refree newRefree = new Refree(experience,totalMatchs,age,ethnicity,height,name);

        refreeList.add(newRefree);
    }

    public ShuttleCock createShuttleCock() {

        System.out.println("Enter candance");
        int candance = sc.nextInt();

        System.out.println("Enter cockType(feather or plastic)");
        String cockType = sc.next();

        System.out.println("Enter the speed : ");
        int speed = sc.nextInt();

        return new ShuttleCock(candance, cockType, speed);
    }

    public ShuttleCock showShuttleCock() {
    	if(shuttleCockList.size() == 0) {
    		System.out.println("No prevvious data found ");
    		return null;
    	}
    	System.out.println("Available Shuttle cocks");
        int count = 1;
        for (ShuttleCock s : shuttleCockList) {
            System.out.println(count + "  " + s.toString());
            count++;
        }
        System.out.println("Enter the show number as your choice");
        int choice = sc.nextInt();
        return shuttleCockList.get(choice - 1);
    }

    public ShuttleCock addShuttleCock() {

        ShuttleCock newShuttleCock = createShuttleCock();
        shuttleCockList.add(newShuttleCock);

        return newShuttleCock;
    }

    //creation of arena
    public Arena createArena() {

        Address arenaAddress;
        System.out.println("Enter arena address : ");
        System.out.println("1) Add new address \n2)Use old one");
        int addressChoice = sc.nextInt();

        if (addressChoice == 1) {
            Address newAddress = createAddress();
            addressList.add(newAddress);
            arenaAddress = showAddress();
        } else {
            arenaAddress = showAddress();
        }

        System.out.println("Enter arena's name : ");
        String name = sc.next();

        System.out.println("Enter arena's capacity");
        int capacity = sc.nextInt();

        List<Audiance> audiances = new ArrayList<>();

        System.out.println("Enter shuttle cock type");
        ShuttleCock shuttleCock = createShuttleCock();

        return new Arena(arenaAddress,audiances,capacity,name,shuttleCock);
    }

    public Arena showArena() {
    	if(arenaList.size() == 0) {
    		System.out.println("No previous Record Found !");
    	}
    	System.out.println("Available Arenas:  ");
        int count = 1;
        for (Arena a : arenaList) {
            System.out.println(count + "  " + a.toString());
            count++;
        }
        System.out.println("Enter the show number as your choice");
        int arenaChoice = sc.nextInt();
        return arenaList.get(arenaChoice - 1);
    }

    public void addArena() {

        Arena newArena = createArena();
        arenaList.add(newArena);
    }

    //Creation of team
    public void addTeam(){
        Team newTeam = createTeam();
        teamList.add(newTeam);
    }

    public Team createTeam(){
        List<Player>players = new ArrayList<>();
        int teamId = teamList.size();
        System.out.println("Enter Team Name ");
        String teamName = sc.next();
        PlayerType type;
        System.out.println("1)SINGLES \n2)DOUBLES");
        int noPlay = sc.nextInt();
        if(noPlay == 1){
            type = PlayerType.SINGLE;
            System.out.println("List of Player available");
            Player player1=showPlayer();
            System.out.println("Enter the player number you want to add on the team: \n");
            
            players.add(player1);
        }
        else{
            type=PlayerType.DOUBLE;
            System.out.println("List of Player available");
            System.out.println("Enter the 1st player number you want: ");
            Player player1=showPlayer();
            System.out.println("List of Player available");
            System.out.println("Enter the 2nd player number you want: ");
            Player player2=showPlayer();
            players.add(player2);
            players.add(player1);
        }
        
        return new Team(players,teamId,teamName,type);
    }

    public Team showTeam() {
    	if(teamList.size() == 0) {
    		System.out.println("Pls Create team to use this option : ");
    	}
    	System.out.println("Available Teams : ");
        int count = 1;
        for (Team a : teamList) {
            System.out.println(count + "  " + a.toString());
            count++;
        }
        System.out.println("Enter the show number as your choice");
        int teamChoice = sc.nextInt();
        return teamList.get(teamChoice - 1);
    }

    public Match addMatch(){
    	if(matchList.size()<=2) {
    		System.out.println("A match should consist of atleast 2 Teams of same Category");
    		return null;
    	}
        System.out.println("Select 1st Team : ");
        Team team1 = showTeam();
        System.out.println("Select 2nd Team : ");
        Team team2 = showTeam();
        CourtDimentions courtDimentions;
        Player testPlayer = team1.getPlayers().get(0);
        courtDimentions = new CourtDimentions(testPlayer.getType());
        Match newMatch = new Match(MatchStatus.YET_TO_START,team1,0,team2,0,courtDimentions);
        matchList.add(newMatch);
        return newMatch;
    }

}