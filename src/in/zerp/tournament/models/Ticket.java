package in.zerp.tournament.models;

public class Ticket{
    private int TicketId;
    private String date;
    private int seatNum;
    private int row;
    private String StadiumName;
    private final double price = 80.0d;
    private Audiance audiance;
	public int getTicketId() {
		return TicketId;
	}
	public void setTicketId(int ticketId) {
		TicketId = ticketId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Ticket [TicketId=" + TicketId + ", date=" + date + ", seatNum=" + seatNum + ", row=" + row
				+ ", StadiumName=" + StadiumName + ", price=" + price + ", audiance=" + audiance.toString();
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public String getStadiumName() {
		return StadiumName;
	}
	public void setStadiumName(String stadiumName) {
		StadiumName = stadiumName;
	}
	public double getPrice() {
		return price;
	}
	public Audiance getAudiance() {
		return audiance;
	}
	public void setAudiance(Audiance audiance) {
		this.audiance = audiance;
	}
	public Ticket(int ticketId, String date, int seatNum, int row, String stadiumName, double price,
			Audiance audiance) {
		super();
		TicketId = ticketId;
		this.date = date;
		this.seatNum = seatNum;
		this.row = row;
		StadiumName = stadiumName;
		this.audiance = audiance;
	}

    
}
