package in.zerp.tournament.models;

public class CourtDimentions{
    private final PlayerType type;
    public final int width;
    public final int length;

    public CourtDimentions(PlayerType type) {
        this.type=type;
        this.length=1340;
        if(type == PlayerType.DOUBLE){
            this.width=610;
        }
        else{
            this.width=518;
        }
    }    

}
