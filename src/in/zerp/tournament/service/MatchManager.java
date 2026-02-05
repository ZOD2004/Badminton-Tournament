package in.zerp.tournament.service;
import in.zerp.tournament.models.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MatchManager {
	//TODO : simulate the matches that are going to happen
	PriorityQueue<Team>singlesTeam = new PriorityQueue<>((a,b)->{
		if(a.getMatchesPlayed() == b.getMatchesPlayed()){
			return b.getMatchesWon() - a.getMatchesWon();
		}
		return a.getMatchesPlayed()-b.getMatchesPlayed();
	});
	PriorityQueue<Team>doublesTeam = new PriorityQueue<>((a,b)->{
		if(a.getMatchesPlayed() == b.getMatchesPlayed()){
			return b.getMatchesWon() - a.getMatchesWon();
		}
		return a.getMatchesPlayed()-b.getMatchesPlayed();
	});

	TournamentService tournamentService = new TournamentService();

	public void splitTeams(){
		for(Team i : tournamentService.teamList){
			if(i.type == PlayerType.DOUBLE){
				doublesTeam.add(i);
			}
			else{
				singlesTeam.add(i);
			}
		}
		tournamentService.teamList.clear();
	}
	List<Match>scheduledMatchesForSingles = new ArrayList<>();
	List<Match>scheduledMatchesForDoubles = new ArrayList<>();
	public void scheduleMatchForSingles() {
		splitTeams();
		if(singlesTeam.size() <= 1){
			System.out.println("There has to be atleast of 2 team to schedule a match");
		}
		System.out.println("SCHEDULED MATCH : :");
		createNewMatch(singlesTeam, scheduledMatchesForSingles, PlayerType.SINGLE);
	}
	public void createNewMatch(PriorityQueue<Team> teams , List<Match> list,PlayerType type){
		while(teams.size() >= 2){
			Team t1 = teams.poll();
			Team t2 = teams.poll();
			System.out.println(t1.getTeamName()+" VS "+t2.getTeamName());
			CourtDimentions courtDimentions = new CourtDimentions(type);
        	Match newMatch = new Match(MatchStatus.YET_TO_START,t1,0,t2,0,courtDimentions);
			list.add(newMatch);
		}
	}
	public void scheduleMatchForDoubles() {
		splitTeams();
		if(doublesTeam.size() <= 1){
			System.out.println("There has to be atleast of 2 team to schedule a match");
		}
		System.out.println("SCHEDULED MATCH : :");
		createNewMatch(doublesTeam, scheduledMatchesForDoubles, PlayerType.DOUBLE);
	}
	public void viewScheduledMatches(List<Match> sch){
		System.out.println("SCHEDULED MATCH : :");
		int count = 1;
		for(Match i:sch){
			Team t1=i.teamA;
			Team t2=i.teamB;
			System.out.println(count+") "+t1.getTeamName()+" VS "+t2.getTeamName());
			count++;
		}
	}
	
	public void playGame(PlayerType playerType,int mat,int t1score,int t2score){
		List<Match> list;
		PriorityQueue<Team>team;
		if(playerType == PlayerType.SINGLE){
			list = scheduledMatchesForSingles;
			team = singlesTeam;

		}
		else{
			list = scheduledMatchesForDoubles;
			team = doublesTeam;
		}
		viewScheduledMatches(list);
		System.out.println("Select the Match Number");
		int matchChoice = mat;//get from main
		if(matchChoice >= list.size()){
			System.out.println("Enter valid Choice");
		}
		Match match = list.get(matchChoice-1);
		Team t1 = match.teamA;
		Team t2 = match.teamB;
		t1.setMatchesPlayed(t1.getMatchesPlayed()+1);
		t2.setMatchesPlayed(t2.getMatchesPlayed()+1);
		System.out.println("NOW PLAYING "+t1.getTeamName()+" VS "+t2.getTeamName());
		System.out.println("Enter Final score of team "+t1.getTeamName());
		int finalScoreTeam1 = t1score; //sc.nextInt();
		match.teamAScores = finalScoreTeam1;
		System.out.println("Enter Final score of team "+t2.getTeamName());
		int finalScoreTeam2 = t2score; //sc.nextInt();
		match.teamBScores = finalScoreTeam2;
		if(finalScoreTeam1 > finalScoreTeam2){
			team.add(t1);
			t1.setMatchesWon(t1.getMatchesWon()+1);
		}
		else{
			team.add(t2);
			t2.setMatchesWon(t2.getMatchesWon()+1);
		}
	}
	public List<Match> getListViaPLayerType(PlayerType playerType){
		if(playerType == PlayerType.DOUBLE){
			return scheduledMatchesForDoubles;
		}
		else{
			return scheduledMatchesForSingles;
		}
	}
}
