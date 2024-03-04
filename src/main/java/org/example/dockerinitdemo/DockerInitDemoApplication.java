package org.example.dockerinitdemo;

import jakarta.annotation.PostConstruct;
import org.example.dockerinitdemo.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableAspectJAutoProxy
@RestController
public class DockerInitDemoApplication {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Docker World";
    }
    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return Stream.of(new Customer(101, "John","alwar","Male"), new Customer(102, "Max","jaip","Male"), new Customer(103, "Sam","asd","aFemal"))
                .collect(Collectors.toList());
    }


    @Autowired
    private  MyService myService;
    public static void main(String[] args) {


        SpringApplication.run(DockerInitDemoApplication.class, args);
    }


    @PostConstruct
    public String init() {
    return    myService.doSomething();

    }
}
