package day15.dynamicproxy;

public class PaymentImpl implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying to customer .. ");

    }
}
