package com.bridgelabz.greeting.greetingapp.service;

import com.bridgelabz.greeting.greetingapp.model.Greeting;
import com.bridgelabz.greeting.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Greeting> updateGreetingMessage(Greeting greeting, int id) {
        Optional<Greeting> greetingObject = greetingRepository.findById(id);
        greetingObject.get().setMessage(greeting.getMessage());
        greetingRepository.save(greetingObject.get());
        return greetingObject;
    }

    public void deleteGreetingMessage(int id) {
        greetingRepository.deleteById(id);
    }
}
