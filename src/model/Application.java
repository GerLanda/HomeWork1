package model;

public class Application {
    public static void main(String[] args) {
        Kotik garfild = new Kotik("Гарфилд", 10, 4, 5);

        garfild.eat("Рыба",10);
        garfild.catInfo();
    }
}
