package in.zerp.tournament;

class Address{
    private int dno;
    private String area;
    protected String city;
    public String district;
    public String country;


    public Address(String area, String city, String country, String district, int dno) {
        this.area = area;
        this.city = city;
        this.country = country;
        this.district = district;
        this.dno = dno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append("dno=").append(dno);
        sb.append(", area=").append(area);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", country=").append(country);
        sb.append('}');
        return sb.toString();
    }
}
