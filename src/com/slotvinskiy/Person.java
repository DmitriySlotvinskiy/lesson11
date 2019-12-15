//1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
//Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
//Создать массив из 100 обьектов типа Person заполненных случайными данными
// (Например создать массив на несколько имен и выбирать из него случайным образом)

package com.slotvinskiy;

import java.util.Random;

public class Person {

    private static final Random RANDOM = new Random();
    public static final int GENDER_BOUNCE = 2;
    public static final int AGE_BOUNCE = 80;
    public static final int MIN_HEIGHT = 45;
    public static final String[] MAN_NAMES = {"Адольф", "Артём", "Борис", "Владмир", "Владислав", "Дмитрий", "Денис",
            "Евгений", "Жан-Франсуа", "Игорь", "Кирилл", "Леонид", "Михаил", "Николай", "Олег", "Петр", "Роман",
            "Сергей", "Тимур", "Феликс", "Юрий", "Ян"};

    private static final String[] MAN_SURNAMES = {"Арбузов", "Борисов", "Волошин", "Сорокин", "Упругий", "Зубов"};

    private static final String[] WOMAN_NAMES = {"Алина", "Вера", "Галина", "Диана", "Ева", "Жанна", "Зоя", "Ирина",
            "Кира", "Лилия", "Марина", "Наталья", "Ольга", "Полина", "Рита", "София", "Татьяна", "Эля", "Юлия", "Яна"};

    private static final String[] WOMAN_SURNAMES = {"Арбузова", "Борисова", "Волошина", "Сорокина", "Упругая", "Зубова"};

    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public static Gender toGenerateGender() {
        if (RANDOM.nextInt(GENDER_BOUNCE) == 0) {
            return Gender.MALE;
        } else {
            return Gender.FEMALE;
        }
    }

    public static String toGenerateManName() {
        return MAN_NAMES[RANDOM.nextInt(MAN_NAMES.length)];
    }

    public static String toGenerateWomanName() {
        return WOMAN_NAMES[RANDOM.nextInt(WOMAN_NAMES.length)];
    }

    public static String toGenerateManSurname() {
        return MAN_SURNAMES[RANDOM.nextInt(MAN_SURNAMES.length)];
    }

    public static String toGenerateWomanSurname() {
        return WOMAN_SURNAMES[RANDOM.nextInt(WOMAN_SURNAMES.length)];
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}
