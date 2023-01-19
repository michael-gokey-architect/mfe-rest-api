package com.mfe.springbootrestapi.controller;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // converts to a MVC controller
//@ResponseBody // tells controller to return the object as serialized JSON and pass back as HttpResponse object
@RestController // combined Controller and ResponseBody as a shortcut in spring 10
public class HelloMikeyController {
    // HTTP GET request on specific handler method
    // http://localhost:8080/hello

    @GetMapping("/hello")
     public String helloMikey(){
         return "Hello Mikey and Karthik!";
     }
}

