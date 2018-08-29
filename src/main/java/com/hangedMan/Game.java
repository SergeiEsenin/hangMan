package com.hangedMan;

import java.util.Scanner;

public class Game {
  private   Scanner scanner = new Scanner(System.in);


    public  void startGame() {
        Player player = getPlayerName();
        System.out.println(player.toString());

    }


    private Player getPlayerName(){
        System.out.println("Please write your name");
        Player player = new Player();
        try{

            player.setName(scanner.next());}
        catch (Exception e){
            System.out.println("Please try again");
            getPlayerName();

        }
        return player;
    }

}
