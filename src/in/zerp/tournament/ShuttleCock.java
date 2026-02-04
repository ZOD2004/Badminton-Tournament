package in.zerp.tournament;

class ShuttleCock{
    private int candance;
    public int speed;
    private String cockType;

    public ShuttleCock(int candance, String cockType, int speed) {
        this.candance = candance;
        this.cockType = cockType;
        this.speed = speed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShuttleCock{");
        sb.append("candance=").append(candance);
        sb.append(", speed=").append(speed);
        sb.append(", cockType=").append(cockType);
        sb.append('}');
        return sb.toString();
    }
}
