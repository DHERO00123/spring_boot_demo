package com.example.demo2.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "puser")
@Component
@PropertySource("classpath:user.properties")
public class User {

    private String id;
    private String name;

    public String getID(){

        return id;
    }

    public String getName(){

        return name;
    }
    public void setID(String id){

        this.id = id;
    }
    public void setName(String name){

        this.name = name;
    }

    @Override
    public String toString() {

        return "id="+this.id+"  "+"name="+this.name;
    }
    
}
