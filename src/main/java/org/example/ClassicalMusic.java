package org.example;

import org.springframework.stereotype.Component;




public class ClassicalMusic implements Music{
    @PostContruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }


    @Override
    public String getSong() {


        return "Classic";
    }
}
