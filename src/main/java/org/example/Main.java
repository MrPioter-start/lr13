package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.printInfo();

        Tester tester2 = new Tester("Петр");
        tester2.printInfo(707);
        System.out.println();
        Tester tester3 = new Tester("Пётр", "Петров", 3, 'B', 2600);
        tester3.printInfo("+375296115371");
        System.out.println();
        Tester.staticMethod();
    }
}
