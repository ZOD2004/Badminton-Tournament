package in.zerp.tournament.models;

public class Player extends Human{
    private int playerId;
    public int ratings;
    private PlayerType type;
    private Address playerAddress;
    private ShuttleRacket racket;
    public int matchesPlayed;
    public int matchesWon;
    public int totalScoredPoint;

    public Player(Address playerAddress, int playerId, ShuttleRacket racket, int ratings, PlayerType type, int age, String ethnicity, int height, String name) {
        super(age, ethnicity, height, name);
        this.playerAddress = playerAddress;
        this.playerId = playerId;
        this.racket = racket;
        this.ratings = ratings;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player{");
        sb.append("playerId=").append(playerId);
        sb.append(", ratings=").append(ratings);
        sb.append(", type=").append(type);
        sb.append(", playerAddress=").append(playerAddress);
        sb.append(", racket=").append(racket);
        sb.append(", matchesPlayed=").append(matchesPlayed);
        sb.append(", matchesWon=").append(matchesWon);
        sb.append(", totalScoredPoint=").append(totalScoredPoint);
        sb.append('}');
        return sb.toString();
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    public Address getPlayerAddress() {
        return playerAddress;
    }

    public void setPlayerAddress(Address playerAddress) {
        this.playerAddress = playerAddress;
    }

    public ShuttleRacket getRacket() {
        return racket;
    }

    public void setRacket(ShuttleRacket racket) {
        this.racket = racket;
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

    public int getTotalScoredPoint() {
        return totalScoredPoint;
    }

    public void setTotalScoredPoint(int totalScoredPoint) {
        this.totalScoredPoint = totalScoredPoint;
    }
    
}