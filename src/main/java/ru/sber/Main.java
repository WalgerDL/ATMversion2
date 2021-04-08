package ru.sber;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    Listener listener = new Listener();
    public static void main(String[] args) {



        SpringApplication.run(Main.class, args);


    }

    public void getListener() {
        listener.testJpaMethods();
    }
}
