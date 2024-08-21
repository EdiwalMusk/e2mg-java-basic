package com.e2mg.java.pecs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<? extends Animal> list = new ArrayList<Dog>();
        Animal animal = list.get(0);

        List<? super Dog> dogList = new ArrayList<Animal>();
        dogList.add(new BlackDog());
        dogList.add(new Dog());
//        dogList.add(new Animal());
        dogList.get(0);
    }
}
