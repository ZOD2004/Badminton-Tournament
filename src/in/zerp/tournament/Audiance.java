package in.zerp.tournament;

class Audiance extends Human{
    private final Ticket ticket;
    private Address audianceAddress;

    public Audiance(Address audianceAddress, Ticket ticket, int age, String ethnicity, int height, String name) {
        super(age, ethnicity, height, name);
        this.audianceAddress = audianceAddress;
        this.ticket = ticket;
    }
    

}
