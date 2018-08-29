package com.hangedMan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    static Random rnd = new Random();

    public static String getRandomWord() {
        List<String> words = Words.getWordsToGuess();
        return words.get(rnd.nextInt(words.size()));
    }

   public static    ArrayList<Character> splitWord(String s) {
        ArrayList<Character> characters = new ArrayList<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }
        return characters;
    }
    public static boolean checkingForValidInput(String s){
        if(s.length()>1)return false;
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

       return !m.find();
    }
    public static void printPlayerName(Player player){
        System.out.println(player.toString());
    }



}
