package org.example;

public class Tester {
    protected String name;
    protected String surname;
    protected double expirienceInYears;
    protected char englishLevel;
    protected double salary;

    public Tester() {
        this("Пётр");
    }
    public Tester(String name) {
        this(name, "Ануфриев");
    }

    public Tester(String name, String surname) {
        this(name , surname, 3.2, 'A', 1.5);
    }

    public Tester(String name, String surname, double expirienceInYears, char englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + "\nФамилия: " + surname +"\nОпыт работы: " + expirienceInYears + " года(лет)" +
                "\nУровень английского: " + englishLevel + "\nЗарплата: $" + salary);
    }

    public void printInfo(int code) {
        System.out.println("\nCVC: " + code + "\nИмя: " + name + "\nФамилия: " + surname + "\nОпыт работы: " + expirienceInYears + " года(лет)"
                + "\nУровень английского: " + englishLevel);
    }

    public void printInfo(String num) {
        System.out.println("Номер телефона: " + num + "\nИмя: " + name + "\nФамилия: " + surname + "\nОпыт работы: " + expirienceInYears + " года(лет)"
         + "\nУровень английского: " + englishLevel);
    }
    public static void staticMethod() {
        System.err.println("Static method");
    }
}
