package in.zerp.tournament;

import java.util.List;

class Team {

    private int teamId;
    public String teamName;
    public PlayerType type;
    public List<Player> players;

    public Team(List<Player> players, int teamId, String teamName, PlayerType type) {
        this.players = players;
        this.teamId = teamId;
        this.teamName = teamName;
        this.type = type;
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

    
}
