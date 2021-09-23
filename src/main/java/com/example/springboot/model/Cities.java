package com.example.springboot.model;

public class Cities {
 private Integer id = null;
 private String name = null;

 Cities (){

 }

 public Cities(String name){
     this.name = name;
 }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
