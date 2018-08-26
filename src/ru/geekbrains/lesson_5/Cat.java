package ru.geekbrains.lesson_5;

public class Cat {

    private String name;
    private int appetit;
    private boolean satiety;

    Cat(String _name, int _appetit){

        this.name = _name;
        this.appetit = _appetit;
        this.satiety = false;

    }

    public String toString(){
        return "CAT: " + name + " appetit: " + appetit + " satiety: " + satiety;
    }

    public void eat(Bowl bowl){

        if (bowl.getFilling() > appetit){
            bowl.delFood(appetit);
            satiety = true;
        }

    }

}
