package com.bridgelabz.greeting.greetingapp.service;

import com.bridgelabz.greeting.greetingapp.model.Greeting;
import com.bridgelabz.greeting.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GreetingAppService {

    @Autowired
    private GreetingRepository greetingRepository;

    public String greetingMessage() {
        return "Hello World";
    }

    public String greetingMessage(String name) {
        String message = "Hello " + name;
        Greeting greeting = new Greeting((int) (greetingRepository.count() + 1), name, message);
        greetingRepository.save(greeting);
        return message;
    }

    public Optional<Greeting> findGreetingMessage(int id) {
        return greetingRepository.findById(id);
    }

    public List<Greeting> listAllGreetingMessage() {
        return greetingRepository.findAll();
    }
}
