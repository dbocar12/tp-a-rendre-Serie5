package com.hakimbocar.exo12;

import java.util.ArrayList;
import java.util.Comparator;
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
        ArrayList<String> wordsWithEvenLength = new ArrayList<>(words);
        System.out.println("List of String with odd length:");
        wordsWithEvenLength.removeIf((word -> (word.length()%2)==0));
        wordsWithEvenLength.forEach(System.out::println);
        System.out.println("==============================================================");

        //  convert words to upperCase
        ArrayList<String> wordsToUpperCase = new ArrayList<>(words);
        wordsToUpperCase.replaceAll(String::toUpperCase);
        System.out.println("List of String to UpperCase:");
        wordsToUpperCase.forEach(System.out::println);
        System.out.println("==============================================================");

        ArrayList<String> wordsStartWithVoyelToUpperCase = new ArrayList<>(words);
        Predicate<String> isStartWithVowel = (s) -> s.startsWith("a") || s.startsWith("i") ||
                s.startsWith("u") || s.startsWith("o") || s.startsWith("e") ||
                s.startsWith("y");

        wordsStartWithVoyelToUpperCase.replaceAll((s) -> isStartWithVowel.test(s) ? s.toUpperCase() : s);
        System.out.println("List of String to UpperCase for words start with vowel:");
        wordsStartWithVoyelToUpperCase.forEach(System.out::println);

        // comparator that compare by length of the string
        ArrayList<String> wordsForLengthComparator = new ArrayList<>(words);
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        // sorting by length of the string
        wordsForLengthComparator.sort(lengthComparator);
        System.out.println("===========================================================");
        System.out.println("List sorted by length of string :");
        wordsForLengthComparator.forEach((s)->System.out.println(s+" \t\tLength->"+s.length()));
        System.out.println("===========================================================");


        ArrayList<String> wordsForLengthThenAlphabeticComparator = new ArrayList<>(words);
        // comparator that compare by length of the string then Alphabetic order
        Comparator<String> compareByLengthThenAlphabetic = Comparator.comparing(String::length).
                thenComparing(String::compareTo);

        /* Version 2
        *
        Comparator<String> compareByLengthThenAlphabetic = (s1, s2) -> {
            if(s1.length() - s2.length() == 0) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        };
        */

        wordsForLengthThenAlphabeticComparator.sort(compareByLengthThenAlphabetic);
        System.out.println("List sorted by length of string then Alphabetic Order :");
        wordsForLengthThenAlphabeticComparator.forEach((s)->System.out.println(s+" \t\tLength->"+s.length()));
        System.out.println("===========================================================");


    }
}
