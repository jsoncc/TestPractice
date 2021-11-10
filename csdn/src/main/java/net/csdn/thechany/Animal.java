package net.csdn.thechany;

class Animal {
    public void eat() {
    }

    public void walk() {
        System.out.println("行为：走路");
    }
}

class Goat extends Animal {
    @Override
    public void eat() {
        System.out.print("Goat eat grass");
    }
}

class Wolf extends Animal {
    @Override
    public void eat() {
        System.out.println("Wolf eat meat");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal goat = new Goat();
        goat.eat();
        Animal wolf = new Wolf();
        wolf.eat();
        wolf.walk();

    }
}
