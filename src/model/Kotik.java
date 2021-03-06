package model;


import java.util.Scanner;


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
        System.out.println("У нас появился новый котик," + name + " Теперь их: " + countCats);
    }

    public Kotik() {
        countCats++;
        System.out.println("Мы нашли нового кота на улице и ничего о нём не знаем.Теперь у нас их: "+countCats);
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
            this.fuel += fuel+10;
            System.out.println("Отлично," + getName() + " покушал!!!");
        }
    }

    public void eat(String food, int fuel) {
        if (fuel > 0 && fuel < 6) {


            switch (food) {
                case "Рыба":
                    this.fuel += fuel + 10;
                    System.out.println("Котик, любит рыбу!!!");
                    break;

                case "Мясо":
                    this.fuel += fuel + 10;
                    System.out.println("Ммм.. вкусно , но лучше бы это была рыбка!!!");
                    break;

                case "Сосиски":
                    this.fuel += fuel+10;
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
        eat(food, 5);
    }

    public boolean play() {
        if (fuel > 0) {
            this.fuel = fuel - 5;
            System.out.println("Котик поиграл...");
            return true;
        } else {
            System.out.println("Котик голоден и не может играть!!!");
            return false;
        }
    }

    public boolean sleep() {
        if (fuel > 0) {
            System.out.println("Котик спит...");
            this.fuel = fuel - 5;
            return true;
        } else {
            System.out.println("Котик голоден и не может уснуть!!!");
            return false;
        }
    }

    public boolean chaseMouse() {
        if (fuel > 0) {
            System.out.println("Котик поймал мышь...");
            this.fuel = fuel - 5;
            return true;
        } else {
            System.out.println("Котик голоден и не может поймат мышь!!");
            return false;
        }
    }

    public boolean walkInTheStreet() {
        if (fuel > 0) {
            System.out.println("Котик  гуляет на улице!!!");
            this.fuel = fuel - 5;
            return true;
        } else {
            System.out.println("Котик голоден и не может пойти гулять!!!");
            return false;
        }
    }

    public boolean doNothing() {
        if (fuel > 0) {
            System.out.println("Котик бездельничает!!!");
            this.fuel = fuel - 5;
            return true;
        } else {
            System.out.println("Котик голоден!!!");
            return false;
        }
    }

    public void lveAnotherDay() throws InterruptedException {

        for (int i = 0; i < 24; i++) {
            if (fuel > 0) {
                int j = (int) (Math.random() * 5) + 1;
                switch (j) {
                    case 1:
                        play();
                        Thread.sleep(3000);
                        continue;

                    case 2:
                        sleep();
                        Thread.sleep(3000);
                        continue;


                    case 3:
                        chaseMouse();
                        Thread.sleep(3000);
                        continue;

                    case 4:
                        walkInTheStreet();
                        Thread.sleep(3000);
                        continue;
                    case 5:
                        doNothing();
                        Thread.sleep(3000);
                        continue;
                }
            } else {
                System.out.println("Кота нужно покомрить введите \"Кушать\"");
                Scanner console = new Scanner(System.in);
                if (console.nextLine().equals("Кушать")) {
                    int j = 0;
                    j = (int) (Math.random() * 3) + 1;
                    switch (j) {
                        case 1:
                            eat(5);
                            continue;

                        case 2:
                            String randomFood = "";
                            int foodGnerate = (int) (Math.random() * 3) + 1;
                          if(foodGnerate==1){
                              randomFood = "Рыба";
                          }

                          else if(foodGnerate==2){
                              randomFood = "Мясо";
                          }
                          else if(foodGnerate==3){
                              randomFood = "Сосиски";
                          }
                            eat(randomFood,5);
                          continue;

                        case 3:
                            eat();
                            continue;
                    }
                }
                else{

                    System.out.println("Такой команды я не понимаю ,дай \"Кушать\" ");

                }
            }

        }
        System.out.println("На сегодня всё, день закончен!");
    }


}







