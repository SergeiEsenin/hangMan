package com.hangedMan;

import java.util.List;
import java.util.Random;

public class Util {
    static Random rnd = new Random();

    public static String getRandomWord(){
      List<String> words = Words.getWordsToGuess();
return words.get(rnd.nextInt(words.size()));
    }


}
