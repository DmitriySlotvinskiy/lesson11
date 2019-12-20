package com.slotvinskiy;

import java.util.Random;

public class PersonMethods {

    private static final Random RANDOM = new Random();
    public static final String[] MAN_NAMES = {"Адольф", "Артём", "Борис", "Владмир", "Владислав", "Дмитрий", "Денис",
            "Евгений", "Жан-Франсуа", "Игорь", "Кирилл", "Леонид", "Михаил", "Николай", "Олег", "Петр", "Роман",
            "Сергей", "Тимур", "Феликс", "Юрий", "Ян"};

    private static final String[] MAN_SURNAMES = {"Арбузов", "Борисов", "Волошин", "Сорокин", "Упругий", "Зубов"};

    private static final String[] WOMAN_NAMES = {"Алина", "Вера", "Галина", "Диана", "Ева", "Жанна", "Зоя", "Ирина",
            "Кира", "Лилия", "Марина", "Наталья", "Ольга", "Полина", "Рита", "София", "Татьяна", "Эля", "Юлия", "Яна"};

    private static final String[] WOMAN_SURNAMES = {"Арбузова", "Борисова", "Волошина", "Сорокина", "Упругая", "Зубова"};




    public static String generateManName() {
        return MAN_NAMES[RANDOM.nextInt(MAN_NAMES.length)];
    }

    public static String generateWomanName() {
        return WOMAN_NAMES[RANDOM.nextInt(WOMAN_NAMES.length)];
    }

    public static String generateManSurname() {
        return MAN_SURNAMES[RANDOM.nextInt(MAN_SURNAMES.length)];
    }

    public static String generateWomanSurname() {
        return WOMAN_SURNAMES[RANDOM.nextInt(WOMAN_SURNAMES.length)];
    }

    public static void printPerson (Person somePerson) {
        System.out.println(String.format("%-15s %-10s %10s years %10s kg %10s cm",
                somePerson.getFirstName(), somePerson.getSecondName(), somePerson.getAge(), somePerson.getWeight(), somePerson.getHeight()));
    }

}
