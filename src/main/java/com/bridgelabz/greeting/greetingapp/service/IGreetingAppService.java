package com.bridgelabz.greeting.greetingapp.service;

import com.bridgelabz.greeting.greetingapp.model.Greeting;

import java.util.List;
import java.util.Optional;

public interface IGreetingAppService {

    String greetingMessage();

    String greetingMessage(String name);

    Optional<Greeting> findGreetingMessage(int id);

    List<Greeting> listAllGreetingMessage();

    Optional<Greeting> updateGreetingMessage(Greeting greeting, int id);

    void deleteGreetingMessage(int id);
}
