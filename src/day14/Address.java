package day14;

public class Address {
    private String street;
    private String city;
    private String zipCode;

    public Address(){

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
//        System.out.println("setStreetMethod");
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
//        System.out.println("setcityMethod");
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
//        System.out.println("setZipMethod");
        this.zipCode = zipCode;
    }

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }


}
