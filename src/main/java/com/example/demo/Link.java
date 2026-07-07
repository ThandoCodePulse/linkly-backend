package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Link {
   @Id
   @GeneratedValue
   private Long id;

   private String longUrl;
   private String shortCode;
   private int clickCount;
  
   public Long getId(){
    return id;
   }
  public  String getLongUrl(){
     return longUrl;
   }
   public String  getShortCode(){
    return shortCode;
   }
   public int getClickCount(){
    return clickCount;
   }
   public void setLongUrl(String longUrl){
    this.longUrl=longUrl;
   }
   public void setShortCode(String shortCode){
      this.shortCode=shortCode;
   }
   public void setClickCount(int clickCount){
    this.clickCount=clickCount;
   }
   public void setId(Long id){
    this.id=id;
   }

}

