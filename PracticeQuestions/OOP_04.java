package PracticeQuestions;

class constructorOverloading {

    String name;
    int age;
    String gender;

    constructorOverloading(String name) {
        this.name = name;
    }

    constructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    constructorOverloading(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class OOP_04 {
    public static void main(String[] args) {
        constructorOverloading first = new constructorOverloading("Ankit");
        constructorOverloading second = new constructorOverloading("Ankit", 21);
        constructorOverloading third = new constructorOverloading("Ankit", 22, "male");

        System.out.println(first.name);
        System.out.println(first.age); // 0
        System.out.println(second.age); // 21
        System.out.println(third.gender); 
        System.out.println(third.age); // 22
    }
}
