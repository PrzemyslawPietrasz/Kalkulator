package com.example.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);

        Calculator numbers1 = new Calculator(5,10);
        Calculator numbers2 = new Calculator(13,6);

        System.out.println(numbers1.addingAToB());
        System.out.println(numbers2.subbstractionBFromA());


    }

}


class Calculator{

    int numberA;
    int numberB;


    public Calculator(int numberA, int numberB){
        this.numberA = numberA;
        this.numberB = numberB;



    }

    public int addingAToB(){
        return numberA+numberB;


    }

    public int subbstractionBFromA(){
        return numberA-numberB;
    }

}