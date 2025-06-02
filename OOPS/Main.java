package OOPS;

class Animal {
    String breed;
    String color;
    String name;
    int age;
}

class Person {
    String name;
    String nationality;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal lion = new Animal();
        
        dog.name = "Tuffy";
        dog.age = 12;
        dog.breed = "Labra";

        lion.name = "Lion";
        lion.age = 10;
        lion.breed = "Normal";

        System.out.println(dog.age);
    }
}
