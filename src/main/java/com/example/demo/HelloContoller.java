package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
		   @GetMapping("/hello")
		    public String getHello(){
              return "Linkly is running";
		}
	    
}
