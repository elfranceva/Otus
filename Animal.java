public abstract class Animal {
     protected String name;
     protected int age;
     protected double weight;
     protected String color;

    public void setName(String name) {
        this.name = name;                    //сеттер Имя
    }

    public String getName() {
    return name;                             //геттер Имя
    }

    public void setAge(int age) {
        this.age = age;                      //сеттер Возраст
    }

    public int getAge() {
        return age;                          //геттер Возраст
    }

    public void setWeight(double weight) {
        this.weight = weight;                //сеттер Вес
    }

    public double getWeigth() {
        return weight;                       //геттер Вес
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }


    @Override
    public String toString() {
        String data;
        if (age % 10 != 1) {
            data = "лет";
        }
        else {
            data = "год";
        }
        return "Привет! меня зовут "
                +name
                +" , мне "
                +age
                +" "
                +data
                +", я вешу - "
                +weight
                +" кг, мой цвет - "
                +color;
    }
}



