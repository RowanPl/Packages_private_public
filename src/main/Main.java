package main;

import models.StudentPrivate;
import models.StudentPackage;
import models.StudentPublic;
import utilities.CoffeeMachine;
import utilities.Printer;

public class Main {
    public static void main(String[] args) {
        StudentPrivate student = new StudentPrivate("John", 20);
        StudentPackage student_package = new StudentPackage("Marie", 20);
        StudentPublic student_public = new StudentPublic("Jordan", 20);


        Printer printer = new Printer();
        printer.print("StudentPrivate name: " + student.getName() + ", age: " + student.getAge());
        printer.print("StudentPublic name: " + student_public.name + ", age: " + student_public.age);
        printer.print("StudentPackage name: " + student_package.getName() + ", age: " + student_package.getAge());

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee();
        coffeeMachine.makeCoffee();
        coffeeMachine.makeCoffee();
        coffeeMachine.makeCoffee();
        coffeeMachine.makeCoffee();

    }
}