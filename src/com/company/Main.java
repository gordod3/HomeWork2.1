package com.company;

public class Main {

    public static void pets(Pet pet, int num){
        System.out.println(pet.getInfo());
        pet.play();
        pet.play(num);
    }
    public static void main(String[] args) {
	Pet sparky = new Pet(Color.GREY, "Sparky", new Toy(Color.WHITE,"Мячик" ));
	Cat barsik = new Cat(Color.BLACK, "Барсик", "манчкин", new Toy(Color.BLACK, "Пишялка"));
	Cat snejok = new Cat(Color.WHITE, "Снежок", "уличный", new Toy(Color.GREY, "Нитка на палке"));
	pets(sparky, 2);
	pets(barsik, 4);
	pets(snejok, 3);
    }
}
