package day13;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
//        op
//                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//                <street>1/2 mg nagar</street><city>hosur</city><zipCode>63992</zipCode>
        Address add1 = new Address("1/2 mg nagar","hosur","63992");
        System.out.println(ObjToXml.convert(add1));
    }

}
