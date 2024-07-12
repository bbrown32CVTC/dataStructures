package edu.cuw.java.unit2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Exercise2_2 {

    public static void main(String[] args) {
        List<String> phrase = new ArrayList<>();
        phrase.add("One Fish");
        phrase.add("Blue Fish");

        Collection<String> extraPhrase = new ArrayList<>();
        extraPhrase.add("Two Fish");
        extraPhrase.add("Red Fish");

        createQuote(1, phrase, extraPhrase);

        System.out.println(phrase);
    }

    public static void createQuote(int index, List<String> list, Collection<String> collection) {
        if (list != null && collection != null) {
            list.addAll(index, collection);
        }
    }
}
