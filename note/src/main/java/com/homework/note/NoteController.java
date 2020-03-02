package com.homework.note;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class NoteController {
    private NoteRepository repository;

    public NoteController(NoteRepository repository) {this.repository=repository; }

    @GetMapping("/note")
    @CrossOrigin
    public Collection<Note> Notes(){
        return repository.findAll();
    }
}
