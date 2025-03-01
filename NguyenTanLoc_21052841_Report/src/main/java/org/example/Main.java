package org.example;

import org.example.singleton.EagerInitializedSingleton;
import org.example.singleton.StaticBlockSingleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        System.out.println(staticBlockSingleton.hashCode());


    }
}