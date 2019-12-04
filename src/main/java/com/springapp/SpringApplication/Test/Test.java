package com.springapp.SpringApplication.Test;

import org.springframework.stereotype.Component;

@Component
public class Test {
    private static int id = 0;

    public Test(){
        // Voir avec le Mentor pourquoi cette ligne ne s'execute pas
        System.out.println("Successfully called the Constructor.");
        //id++;
    }

    public void start() {
        System.out.println("Test successfully started.");
        id++;
    }

    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }

}