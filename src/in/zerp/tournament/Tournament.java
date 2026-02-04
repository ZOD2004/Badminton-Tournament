package in.zerp.tournament;


import java.util.List;

class Tournament{

    public final int tournamentId;
    public final String tournamentName;
    int totalNumberOfMatches;
    private double totalPrice;
    List<Match> match;


    public Tournament(List<Match> match, double totalPrice,
     int tournamentId, String tournamentName) {
        
        this.match = match;
        this.totalPrice = totalPrice;
        this.tournamentId = tournamentId;
        this.tournamentName = tournamentName;
    }

    public void viewMatches(){
        for(Match i:match){
            System.out.println(i.toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tournament{");
        sb.append("tournamentId=").append(tournamentId);
        sb.append(", tournamentName=").append(tournamentName);
        sb.append(", totalNumberOfMatches=").append(totalNumberOfMatches);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", match=").append(match);
        sb.append('}');
        return sb.toString();
    }



}
