package com.example.Mybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteRepository repository;
    public NoteController(NoteRepository repository) {this.repository=repository; }

    @GetMapping("/note")
    @CrossOrigin
    public List<Note> Notes(){
        return repository.findAll();
    }
}
