import model.Kotik;

public class Application {
    public static void main(String[] args)  {
        Kotik garfild = new Kotik("Гарфилд", 10, 4, 5);
        Kotik tom = new Kotik();

        tom.setName("Том");
        tom.setAge(1);
        tom.setWeight(4);
        tom.eat(5);
        tom.setMeow("Миууу...");
        garfild.setMeow("Мяуууууу....");
        Kotik.comparison(garfild, tom);

        garfild.lveAnotherDay();


    }
}
