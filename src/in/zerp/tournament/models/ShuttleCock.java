package in.zerp.tournament.models;

public class ShuttleCock{
    public int getCandance() {
		return candance;
	}

	public void setCandance(int candance) {
		this.candance = candance;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCockType() {
		return cockType;
	}

	public void setCockType(String cockType) {
		this.cockType = cockType;
	}

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
