package com.example.demo;

public class LinkResponse {
    private String longUrl;
    private String shortCode;

    public String getLongUrl(){
        return longUrl;
    }
    public String getShortCode(){
        return shortCode;
    }
    public void setLongUrl(String longUrl){
        this.longUrl=longUrl;
    }
    public void setShortCode(String shortCode){
        this.shortCode=shortCode;
    }
}
