package com.kaiburr.javaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class JavaApiApplication {

	public static void main(String[] args) {SpringApplication.run(JavaApiApplication.class, args);}

}
