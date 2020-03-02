package com.example.Mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class MybatisApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NoteRepository repository;

    @Override
    public void run(String...args) throws Exception {

        logger.info("All users -> {}", repository.findAll());
    }

    public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

}
