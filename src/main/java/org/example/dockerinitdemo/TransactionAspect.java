package org.example.dockerinitdemo;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Aspect
@Component
public class TransactionAspect {

    @Before("execution(* org.example.dockerinitdemo.MyService.doSomething())")
    @Transactional
    public void doTransaction() {
        System.out.println("Transaction started...");
    }

}
