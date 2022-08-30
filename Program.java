import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("add/list/exit:");
            // String choice = sc.nextLine().trim().toUpperCase();
            Command choice = Command.valueOf(sc.next().toUpperCase());

            switch (choice) {
                case ADD:
                    System.out.println("cat/dog/duck");
                    String type = sc.next().toUpperCase();

                    if (type.equals("CAT")) {
                        Animal cat = new Cat();
                        System.out.println("Как зовут?");
                        String name = sc.next().trim();
                        cat.setName(name);
                        System.out.println("Сколько лет?");
                        int age = sc.nextInt();
                        cat.setAge(age);
                        System.out.println("Сколько весит?");
                        double weight = sc.nextDouble();
                        cat.setWeight(weight);
                        System.out.println("Какой цвет?");
                        String color = sc.next();
                        cat.setColor(color);
                        animals.add(cat);
                        cat.say();

                    } else if (type.equals("DOG")) {
                        Animal dog = new Dog();
                        System.out.println("Как зовут?");
                        String name = sc.next().trim();
                        dog.setName(name);
                        System.out.println("Сколько лет?");
                        int age = sc.nextInt();
                        dog.setAge(age);
                        System.out.println("Сколько весит?");
                        double weight = sc.nextDouble();
                        dog.setWeight(weight);
                        System.out.println("Какой цвет?");
                        String color = sc.next().trim();
                        dog.setColor(color);
                        animals.add(dog);
                        dog.say();

                    } else if (type.equals("DUCK")) {
                        Animal duck = new Duck();
                        System.out.println("Как зовут?");
                        String name = sc.next().trim();
                        duck.setName(name);
                        System.out.println("Сколько лет?");
                        int age = sc.nextInt();
                        duck.setAge(age);
                        System.out.println("Сколько весит?");
                        double weight = sc.nextDouble();
                        duck.setWeight(weight);
                        System.out.println("Какой цвет?");
                        String color = sc.next().trim();
                        duck.setColor(color);
                        animals.add(duck);
                        duck.say();

                    }
                    break;

                case LIST:
                    for (Animal animal : animals)
                    System.out.println(animal);
                    break;

                case EXIT:
                    System.out.println("Exit");
                    System.exit(0);

            }
        }
    }
}

