package com.homework.note;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class NoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoteApplication.class, args);
    }
    @Bean
    ApplicationRunner init(NoteRepository repository) {
        return args -> {
            Stream.of("Hello World").forEach(name -> {
                Note note = new Note();
                note.setName(name);
                repository.save(note);
            });
            repository.findAll().forEach(System.out::println);
        };
    }
}
