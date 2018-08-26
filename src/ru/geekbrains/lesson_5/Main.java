package ru.geekbrains.lesson_5;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Cat[] cats = {new Cat("Vasya", 5), new Cat("Myrzik", 8), new Cat("Kyzya", 15)};
    Bowl bowl = new Bowl(2);

    for (Cat cat : cats){
        System.out.println(cat);
    }

        System.out.println("V miske: " + bowl + "g korma");
        System.out.println("dobavim v misky 20g korma");
        bowl.addFood(20);
        System.out.println("V miske: " + bowl + "g korma");
        System.out.println("Koty kyshayut:");

        for (Cat cat : cats){
            cat.eat(bowl);
            System.out.println(cat);
            System.out.println(bowl);
            System.out.println("\n");
        }

    }
}
