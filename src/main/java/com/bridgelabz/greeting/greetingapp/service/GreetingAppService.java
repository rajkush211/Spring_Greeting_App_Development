package com.bridgelabz.greeting.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {

    public String greetingMessage() {
        return "Hello World\n";
    }
}
