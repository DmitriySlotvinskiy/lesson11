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


    private String firstName;
    private String secondName;
    private Gender gender;
    private int age;
    private int weight;
    private int height;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(String firstName, String secondName, int age, int weight, int height) {
        this.firstName = firstName;
        this.secondName = secondName;
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

    public static Random getRANDOM() {
        return RANDOM;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + firstName + '\'' +
                ", surname='" + secondName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
