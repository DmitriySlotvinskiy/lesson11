package com.slotvinskiy;

import java.util.Random;

public class Main {

    private static final int NAMES_LIST_SIZE = 100;
    private static final Random RANDOM = new Random();


    public static void main(String[] args) {

        Person[] personsList = new Person[NAMES_LIST_SIZE];
        toGeneratePersonsList(personsList);
        toPrintListOfPersons(personsList);
    }

    private static void toGeneratePersonsList(Person[] personsList) {
        for (int i = 0; i < NAMES_LIST_SIZE; i++) {
            if (Person.toGenerateGender() == Gender.MALE) {
                personsList[i] = new Person(Person.toGenerateManName(), Person.toGenerateManSurname());
                personsList[i].setGender(Gender.MALE);
            } else {
                personsList[i] = new Person(Person.toGenerateWomanName(), Person.toGenerateWomanSurname());
                personsList[i].setGender(Gender.FEMALE);
            }
            personsList[i].setAge(RANDOM.nextInt(Person.AGE_BOUNCE));
            personsList[i].setHeight(toGetHeight(personsList[i].getAge()));
        }
    }

    private static int toGetHeight(int age) {
        if (age < 1) {
            return RANDOM.nextInt(5) + Person.MIN_HEIGHT;
        } else if (age < 5) {
            return RANDOM.nextInt(5) + 55;
        } else if (age < 8) {
            return RANDOM.nextInt(5) + 110;
        } else if (age < 12) {
            return RANDOM.nextInt(10) + 150;
        } else if (age < 20) {
            return RANDOM.nextInt(15) + 155;
        } else if (age < 55) {
            return RANDOM.nextInt(20) + 165;
        } else {
            return RANDOM.nextInt(20) + 160;
        }
    }

    private static void toPrintListOfPersons(Person[] personsList) {
        for (int i = 0; i < personsList.length; i++) {
            System.out.println(personsList[i]);
        }
    }


}
