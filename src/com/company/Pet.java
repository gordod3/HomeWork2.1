package com.company;

public class Pet extends Animals {
    private String name;
    private Toy toy;

    public Pet(Color color, String name, Toy toy) {
        super(color);
        this.name = name;
        this.toy = toy;
    }

    public void play(int i){
        System.out.println(this.name + " играет с " + toy.name + " уже " + i + " раз.");
    }

    public final void play(){
        System.out.println(this.name + " играет.");
    }

    public String getInfo(){
        return "Питомец " + this.getClass().getSimpleName() + " " + getName() + ":\n" +
                "Имя: " + getName() + ".\n" +
                "Возраст: " + getAge() + ".\n" +
                "Цвет: " + getColor() + ".\n" +
                "Игрушка: Имя - " + toy.name + ". Цвет - " + getToy().color +  ".";
    }

    public Toy getToy() {
        return toy;
    }

    public String getName() {
        return name;
    }
}
