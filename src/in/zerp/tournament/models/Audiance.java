package in.zerp.tournament.models;

public class Audiance extends Human{
    

	private Address audianceAddress;

    public Audiance(Address audianceAddress, int age, String ethnicity, int height, String name) {
        super(age, ethnicity, height, name);
        this.audianceAddress = audianceAddress;
    }

	public Address getAudianceAddress() {
		return audianceAddress;
	}

	public void setAudianceAddress(Address audianceAddress) {
		this.audianceAddress = audianceAddress;
	}
	@Override
	public String toString() {
		return "Audiance [audianceAddress=" + audianceAddress.toString() + "]";
	}

    

}
