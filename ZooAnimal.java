class Animal {
    String name;
    double weight;

    Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}

class Lion extends Animal {
    double meatPerDay;

    Lion(String name, double weight, double meatPerDay) {
        super(name, weight);
        this.meatPerDay = meatPerDay;
    }
}

class Snake extends Animal {
    double length;

    Snake(String name, double weight, double length) {
        super(name, weight);
        this.length = length;
    }
}

class Monkey extends Animal {
    String favoriteFood;

    Monkey(String name, double weight, String favoriteFood) {
        super(name, weight);
        this.favoriteFood = favoriteFood;
    }
}

public class ZooAnimal {
    public static void main(String[] args) {
        Lion leo = new Lion("Leo", 300, 5);
        Snake ana = new Snake("Ana", 50, 5);
        Monkey george = new Monkey("George", 120, "kiwi");

        System.out.println(leo.name + " weighs " + leo.weight + " pounds and consumes " + leo.meatPerDay
                + " pounds of meat every day.");
        System.out.println(ana.name + " weighs " + ana.weight + " pounds and is " + ana.length + " feet long.");
        System.out.println(george.name + " is a monkey. He weighs " + george.weight + " pounds and loves "
                + george.favoriteFood + ".");
    }
}
