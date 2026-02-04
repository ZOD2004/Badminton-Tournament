package in.zerp.tournament.models;

public class ShuttleRacket{
    private String make;
    private double weight;
    private String balance;
    private String shaftStiffness;
    private String headShape;

    public ShuttleRacket(String make,double weight, String balance, String shaftStiffness, String headShape) {
        this.balance = balance;
        this.headShape = headShape;
        this.make = make;
        this.shaftStiffness = shaftStiffness;
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getShaftStiffness() {
        return shaftStiffness;
    }

    public void setShaftStiffness(String shaftStiffness) {
        this.shaftStiffness = shaftStiffness;
    }

    public String getHeadShape() {
        return headShape;
    }

    public void setHeadShape(String headShape) {
        this.headShape = headShape;
    }

	@Override
	public String toString() {
		return "ShuttleRacket [make=" + make + ", weight=" + weight + ", balance=" + balance + ", shaftStiffness="
				+ shaftStiffness + ", headShape=" + headShape + "]";
	}

}
