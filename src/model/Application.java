package model;

public class Application {
    public static void main(String[] args) {
        Kotik garfild = new Kotik("Гарфилд", 10, 4, 5);

        garfild.catInfo();
        garfild.eat();
        garfild.catInfo();

    }
}
