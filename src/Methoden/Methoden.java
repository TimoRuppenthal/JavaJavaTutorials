package Methoden;

public class Methoden {

    public static void main(String[] args) {

        System.out.println("Vor dem Methodenaufruf");
        doSomething(20, 20);
        System.out.println("Nach dem Methodenaufruf");


    }

    public static void doSomething(int number1, int number2){
        int x = number1;
        int y = number2;
        int result = x + y;

    }
}
