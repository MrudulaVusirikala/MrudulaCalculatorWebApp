package com.example.targettech.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class CalRequest {
    @NotNull(message = "number1 can't be empty!")
    Integer number1;
    @NotNull(message = "number2 can't be empty!")
    Integer number2 ;
    @NotBlank(message = "operation can't be empty!")
    String operation;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "CalRequest{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", operation='" + operation + '\'' +
                '}';
    }
}
