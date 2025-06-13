package OOPS;

class Person {
    String name;
    int age;

    // Creating a constructor and it doesn't have any return type
    Person(String name) {
        // System.out.println("Creating an Object"); // To check whether constructor is called everytime, whenever we create an object!
        this.name = name;
        System.out.println("Calling with name");
    }

    Person() {
        System.out.println("Calling without the name");
    }
}

public class Constructor {
    public static void main(String[] args) {
        // In Java, all tasks that should be performed when an object is created should be placed inside a constructor
        Person ankit = new Person("Ankit");
        Person john = new Person();
    }
}
