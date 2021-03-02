package com.hakimbocar.exo12;

import java.util.ArrayList;
import java.util.function.Predicate;

public class exo12 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("twelve");
        System.out.println("List of String:");
        words.forEach(System.out::println);
        System.out.println("==============================================================");

        // Remove the string if its length is even
        System.out.println("List of String with odd length:");
        words.removeIf((word -> (word.length()%2)==0));
        words.forEach(System.out::println);
        System.out.println("==============================================================");

        //words.replaceAll(String::toUpperCase);

        Predicate<String> isStartWithVowel = (s) -> s.startsWith("a") || s.startsWith("i") ||
                s.startsWith("u") || s.startsWith("o") || s.startsWith("e") ||
                s.startsWith("y");


        words.forEach(System.out::println);
        System.out.println("==============================================================");





    }
}
