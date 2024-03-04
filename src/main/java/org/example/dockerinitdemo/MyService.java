package org.example.dockerinitdemo;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String doSomething() {
        System.out.println("Doing something...");
        return "Done";
    }
}
