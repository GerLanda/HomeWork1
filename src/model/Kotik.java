package model;


public class Kotik {
    private String name;
    private int weight;
    private int fuel;
    private int age;
    public static int countCats = 0;

    public Kotik(String name, int weight, int age, int fuel) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.fuel = fuel;
        countCats++;
        System.out.println("У нас появился новый котик, " + name + " теперь их: " + countCats);
    }

    public Kotik() {
        countCats++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void catInfo() {
        System.out.println("Имя: " + getName() + " \nВозраст: " + getAge() + "\nМасса: " + getWeight() + "\nНасыщенность: " + getFuel());
    }

    public void eat(int fuel) {
        if (fuel <= 0 || fuel > 5) {
            System.out.println("Котик, может съесть только от 1 до 5 порций!!!");
        }
        if (fuel > 0 && fuel < 6) {
            this.fuel += fuel;
            System.out.println("Отлично," + getName() + " покушал!!!");
        }
    }

    public void eat(String food, int fuel) {
        if (fuel > 0 && fuel < 6) {


            switch (food) {
                case "Рыба":
                    this.fuel += fuel + 3;
                    System.out.println("Котик, любит рыбу!!!");
                    break;

                case "Мясо":
                    this.fuel += fuel + 1;
                    System.out.println("Ммм.. вкусно , но лучше бы это была рыбка!!!");
                    break;

                case "Сосиски":
                    this.fuel += fuel;
                    System.out.println("Сосиски..?? ну ладно сойдет");
                    break;

                default:
                    System.out.println("Нее... ,я такое не ем!!! Давай - ка (Рыба),(Мясо),(Сосиски)");

            }
        } else {
            System.out.println("Порций может быть от 1 до 5, Рацион - Рыба, Мясо, Сосиски");
        }
    }

    public void eat() {
        int i = 0;
        String food = "";
        i = (int) (Math.random() * 3) + 1;
        switch (i) {
            case 1:
                food = "Рыба";
                break;
            case 2:
                food = "Мясо";
                break;
            case 3:
                food = "Сосиски";
                break;
        }
        eat(food,5);
    }




}







