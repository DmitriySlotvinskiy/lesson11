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
            personsList[i].setWeight(toGetWeight(personsList[i].getHeight()));
        }
    }

    private static int toGetWeight(int height) {
        if ( height < 60) {
            return 3 + RANDOM.nextInt(1);
        } else if (height < 100) {
            return 15 + RANDOM.nextInt(5);
        } else if (height < 150) {
           return 25 + RANDOM.nextInt(10);
        } else {
            return height - 100 + RANDOM.nextInt(5);
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
            return RANDOM.nextInt(15) + 165;
        } else {
            return RANDOM.nextInt(15) + 160;
        }
    }

    private static void toPrintListOfPersons(Person[] personsList) {
        System.out.println(String.format("%-15s %-15s %6s %20s %11s   ",
                "NAME", "SURNAME", "AGE", "WEIGHT", "HEIGHT"));
        System.out.println("=======================================================================");
        for (int i = 0; i < personsList.length; i++) {
            System.out.println(personsList[i]);
        }
    }


}
