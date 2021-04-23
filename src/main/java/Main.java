package ru.netology;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message = getMessage();
        getDictionary(message);
    }

    private static String getMessage() {
        System.out.print("Введите сообщение аборигенов: ");
        return new Scanner(System.in).nextLine();
    }

    private static void getDictionary(String message) {
        Arrays.stream(message.split("\\p{Punct}|\\s+"))
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }


}