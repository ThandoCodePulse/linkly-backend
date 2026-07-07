package com.example.demo;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LinkController {
    @Autowired
     private LinkRepository linkRepository;

    @PostMapping("/links")
    public LinkResponse shortLink(@RequestBody LinkRequest request){
        LinkResponse response=new LinkResponse();
        response.setShortCode(generateShortCode());
        response.setLongUrl(request.getLongUrl());
        Link link=new Link();
        link.setShortCode(response.getShortCode());
        link.setLongUrl(request.getLongUrl());
        linkRepository.save(link);
        return response;
    }

    
     public String generateShortCode(){
        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String shortCodeStr="";
       Random rand=new Random();
        for(int i=0;i<6;i++){
            shortCodeStr+=pool.charAt(rand.nextInt(pool.length()));
        }
        return shortCodeStr;
    }
}
