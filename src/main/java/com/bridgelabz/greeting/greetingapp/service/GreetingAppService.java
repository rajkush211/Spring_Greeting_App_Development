package com.bridgelabz.greeting.greetingapp.service;

import com.bridgelabz.greeting.greetingapp.model.Greeting;
import com.bridgelabz.greeting.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {
    
    @Autowired
    private GreetingRepository greetingRepository;

    public String greetingMessage() {
        return "Hello World";
    }

    public String greetingMessage(String name) {
        String message = "Hello " + name;
        Greeting greeting = new Greeting(greetingRepository.count() + 1, name, message);
        greetingRepository.save(greeting);
        return message;
    }
}
