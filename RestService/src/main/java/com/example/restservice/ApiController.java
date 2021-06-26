package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiController {


    @Autowired
    private Environment env;

    @GetMapping("/service-test")
    public Result serviceTest (){

        return new Result("00","Success");
    }

    @GetMapping("/get-token")
    public Result serviceTest (@RequestParam(value = "username") String userName,@RequestParam(value = "password") String password){

        return new Result("01","Invalid Username or password");
    }


    @GetMapping("/get-project-name")
    public Result getProjectName (){

        return new Result("00",env.getProperty("spring.application.name"));
    }
}
