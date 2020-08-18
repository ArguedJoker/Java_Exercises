package com.qa.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MorseCode {
    static List<String> alphabet = new ArrayList<>();
    static List<String> morsealphabet = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(alphabet, "a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        Collections.addAll(morsealphabet, ".-","-...","-.-.", "-..", ".", "..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        System.out.println(method1("Hello World"));
        System.out.println(method2(".../---/..."));
    }
    public static String method1(String morse){
        String[] array = morse.split("",0);
        StringBuilder myString = new StringBuilder();
        for(String i : array) {
            for (int e = 0; e < alphabet.size(); e++){
                if (i.toUpperCase().equals(alphabet.get(e).toUpperCase())) {
                    myString.append(morsealphabet.get(e));
                }
            }
            if(i.equals(" ")){
                myString.append("/");
            }
        }
        return myString.toString();
    }
    public static String method2(String toMorse){
        String[] myArr = toMorse.split("/",0);
        StringBuilder myString = new StringBuilder();
        for(String i : myArr) {
            for (int e = 0; e < morsealphabet.size(); e++){
                if (i.equals(morsealphabet.get(e))) {
                    myString.append(alphabet.get(e));
                }
            }
        }
        return myString.toString();
    }
}

