package PracticeQuestions;

class Car {
    String brand;
    int model;
    int year;

    Car(String brand, int model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void showDetails() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
    }
}

public class OOP_01 {
    public static void main(String[] args) {
        Car myCar = new Car("India", 2003, 2000);
        myCar.showDetails();
    }
}
