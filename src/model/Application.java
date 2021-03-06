package model;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Kotik garfild = new Kotik("Гарфилд", 10, 4, 5);
        Kotik tom = new Kotik();

        tom.setName("Том");
        tom.setAge(5);
        tom.setWeight(5);
        tom.eat(5);

        tom.lveAnotherDay();




    }
}
