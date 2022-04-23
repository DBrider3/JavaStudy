package com.javaStudy02;

public class ArithmeticOperation {

    private double num1;
    private double num2;

    public void setNums(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double plus(){
        return num1 + num2;
    }
    public double minus(){
        return num1 - num2;
    }
    public double mul(){
        return num1 * num2;
    }
    public double div(){
        return num1 / num2;
    }
}
