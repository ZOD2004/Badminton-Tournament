package in.zerp.tournament.models;

import java.util.List;

public class Team {

    @Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", type=" + type + ", players=" + players.toString() + "]";
	}

	private int teamId;
    public String teamName;
    public PlayerType type;
    public List<Player> players;
    
    private  int matchesPlayed;
    private int matchesWon;

    public Team(List<Player> players, int teamId, String teamName, PlayerType type) {
        this.players = players;
        this.teamId = teamId;
        this.teamName = teamName;
        this.type = type;
        this.matchesPlayed = 0;
        this.matchesWon = 0;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    
}
