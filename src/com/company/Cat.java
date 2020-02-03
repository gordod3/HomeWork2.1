package com.company;

public final class Cat extends Pet {
    private String breed;

    public Cat(Color color, String name, String breed, Toy toy) {
        super(color, name, toy);
        this.breed = breed;
    }

    public String getInfo(){
        return "Питомец " + this.getClass().getSimpleName() + " " + getName() + ":\n" +
                "Имя: " + getName() + ".\n" +
                "Возраст: " + getAge() + ".\n" +
                "Порода: " + getBreed() + ".\n" +
                "Цвет: " + getColor() + ".\n" +
                "Игрушка: Имя - " + getToy().name + ". Цвет - " + getToy().color + ".";
    }
    public void play(int i){
        System.out.println("Котик " + getName() + " играет с " + getToy().name + " уже " + i + " раз.");
    }
    
    public String getBreed() {
        return breed;
    }
}
