package com.javaStudy02;

public class ArithmeticOperationTest {
    public static void main(String[] args) {
        ArithmeticOperation ao = new ArithmeticOperation();
        ao.setNums(3, 5);
        System.out.println(ao.plus());
        System.out.println(ao.minus());
        System.out.println(ao.mul());
        System.out.println(ao.div());
    }
}
