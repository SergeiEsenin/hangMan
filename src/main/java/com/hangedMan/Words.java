package com.hangedMan;

import java.util.ArrayList;
import java.util.Collection;

public  class Words {

 private  static  ArrayList<String> wordsToGuess;

    static  {
        wordsToGuess=new ArrayList<String>();
        wordsToGuess.add("Beautiful");
        wordsToGuess.add("Something");
        wordsToGuess.add("Toolkit");
        wordsToGuess.add("Tooooot");
    }

    public static ArrayList<String> getWordsToGuess() {

        return wordsToGuess;
    }
    public static void addWord(String word){
        wordsToGuess.add(word);
    }
    public static void addWords(Collection<? extends String> array){
        wordsToGuess.addAll(array);
    }

}
