package com.lombok.app;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.List;

@Slf4j
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person person = new Person(1L,"Renzo","Alvarez",
                "renzo.10@gmail.com",22,31231,LocalDate.now());
        log.info(person.toString());
        System.out.println(person);


        Person person2 = Person.builder().id(2L).name("Jose").build();

        System.out.println(person2);

    }
}
