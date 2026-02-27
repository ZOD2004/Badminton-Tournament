package day15.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class PaymentInvocationHandler implements InvocationHandler {
    private Object target;
    public PaymentInvocationHandler(Object target){
        this.target=target;
    }
    Logger logger = Logger.getLogger(PaymentInvocationHandler.class.getName());
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method execution");
        logger.info("Logging before method execution");
        Object obj = method.invoke(target,args);
        System.out.println("After method execution");
        logger.info("method after execution called finest");
        return target;
    }
}
