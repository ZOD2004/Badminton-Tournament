package in.zerp.tournament;

class Refree extends Human{
    protected int experiance;
    public int totalMatchs;

    public Refree(int experiance, int totalMatchs, int age, String ethnicity, int height, String name) {
        super(age, ethnicity, height, name);
        this.experiance = experiance;
        this.totalMatchs = totalMatchs;
    }
    
}