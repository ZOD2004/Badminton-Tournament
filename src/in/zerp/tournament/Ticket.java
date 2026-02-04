package in.zerp.tournament;

class Ticket{
    private int TicketId;
    private String date;
    private int seatNum;
    private int row;
    private String StadiumName;
    private double price;

    public Ticket(String StadiumName, int TicketId, String date, double price, int row, int seatNum) {
        this.StadiumName = StadiumName;
        this.TicketId = TicketId;
        this.date = date;
        this.price = price;
        this.row = row;
        this.seatNum = seatNum;
    }

    public int getTicketId() {
        return TicketId;
    }

    public void setTicketId(int TicketId) {
        this.TicketId = TicketId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
