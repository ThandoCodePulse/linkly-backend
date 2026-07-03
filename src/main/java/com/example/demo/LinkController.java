package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LinkController {
    @PostMapping("/links")
    public LinkResponse shortLink(@RequestBody LinkRequest request){
        LinkResponse response=new LinkResponse();
        response.setShortCode("abc123");
        response.setLongUrl(request.getLongUrl());
        return response;
    }
}
