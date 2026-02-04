package in.zerp.tournament.models;

public class Match{

    public Team teamA;
    public Team teamB;
    
    public int teamAScores;
    public int teamBScores;

    public MatchStatus matchStatus;
    
    
    
    // public final Team matchWonBy;
    private CourtDimentions courtDimentions;



    public Match( 
    MatchStatus matchStatus, Team teamA, 
    int teamAScores, Team teamB, int teamBScores,CourtDimentions courtDimentions) {
        this.matchStatus = matchStatus;
        this.teamA = teamA;
        this.teamAScores = teamAScores;
        this.teamB = teamB;
        this.teamBScores = teamBScores;
        this.courtDimentions=courtDimentions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Match{");
        sb.append("teamA=").append(teamA);
        sb.append(", teamB=").append(teamB);
        sb.append(", teamAScores=").append(teamAScores);
        sb.append(", teamBScores=").append(teamBScores);
        sb.append(", matchStatus=").append(matchStatus);
        sb.append(", dimensions=").append(courtDimentions);
        sb.append('}');
        return sb.toString();
    }

    

}