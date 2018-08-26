package ru.geekbrains.lesson_5;

public class Bowl {

    private int filling;

    Bowl(int _filling){
        this.filling = _filling;
    }

    public String toString(){
        return "Bowl: " + filling;
    }

    int getFilling(){
        return filling;
    }

    public void addFood(int food){
        filling += food;
    }

    public void delFood(int appetit){
        if (filling >= appetit){
            filling -= appetit;
        }
    }

}
