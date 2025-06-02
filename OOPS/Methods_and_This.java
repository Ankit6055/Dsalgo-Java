package OOPS;

class Person {
    String name;
    int age;

    // In Java, functions defined inside a class are called methods.
    void speak() {
        System.out.println(this.name + " able to speak now");
    }

    void walk() {
        System.out.println(this.name + " is walking");
    }

    void saySomething(String say) {
        System.out.println(name + ": " + say);
    }
}

public class Methods_and_This {
    public static void main(String[] args) {
        Person ankit = new Person();
        Person john = new Person();

        ankit.name = "Ankit";
        john.name = "John";

        ankit.speak();
        john.speak();

        ankit.walk();
        john.walk();

        ankit.saySomething("How are you guys?");
        john.saySomething("I am good everyone!");
    }
}
