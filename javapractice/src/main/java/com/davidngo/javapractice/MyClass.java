package com.davidngo.javapractice;

public class MyClass {
    public static void main(String[] args) {
        final double BMI = BMICaculator(55, 1.6);
        if (BMI > 25) {
            System.out.println("You are overweight");
        }else if (BMI > 18.5) {
            System.out.println("You are normal weight");
        } else {
            System.out.println("You are underweight");
        }

    }
    public static double BMICaculator (double weight, double height) {
        return weight / (height * height);
    }
}
