package com.company;

import java.util.Random;

public class Animals {
    private Color color;
    private int Age = generateDefaultAge();

    public Animals(Color color) {
        this.color = color;
    }

    private int generateDefaultAge(){
        Random r = new Random();
        return  r.nextInt(20);
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return Age;
    }
}
