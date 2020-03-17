package com.example.targettech.services;

import com.example.targettech.model.CalRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalService {

 public int calculate(CalRequest calRequest){
     System.out.println(calRequest);
     switch (calRequest.getOperation()){
         case "Add":
         return add(calRequest.getNumber1(),calRequest.getNumber2());
         case "Subtract":
             return subtract(calRequest.getNumber1(),calRequest.getNumber2());
         case "Multiply":
             return multiply(calRequest.getNumber1(),calRequest.getNumber2());
         case "Divide":
             return (int) divide(calRequest.getNumber1(),calRequest.getNumber2());
         default:
             return 0;
     }
 }

    public int add(int i, int j ){
        return i+j;
    }
    private int subtract(int i, int j ){
        return i-j;
    }
    private int multiply(int i, int j){
        return i*j;
    }
    private double divide(int i, int j){
        return ((double)i/j);
    }
}
