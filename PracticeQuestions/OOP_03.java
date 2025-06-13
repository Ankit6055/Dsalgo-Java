package PracticeQuestions;

class Calculator {
    int num1;
    int num2;

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition() {
        return num1 + num2;
    }

    public int subtraction() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int division() {
        return num1/num2;
    }
}

public class OOP_03 {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator(11, 9);
        
        System.out.println(calc1.addition());
        System.out.println(calc1.subtraction());
        System.out.println(calc1.multiply());
        System.out.println(calc1.division());
    }
}
