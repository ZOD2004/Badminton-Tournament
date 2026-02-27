package day15.dynamicproxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Payment payment = new PaymentImpl();
        PaymentInvocationHandler paymentInvocationHandler
                = new PaymentInvocationHandler(payment);
        Payment pay = (Payment) Proxy.newProxyInstance(payment.getClass().getClassLoader(),
                payment.getClass().getInterfaces(),paymentInvocationHandler);
        pay.pay();

    }
}