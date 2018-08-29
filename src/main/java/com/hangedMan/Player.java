package com.hangedMan;

public class Player {
   private String name;
   private int lives;
   public Player(){
        lives=5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void decrementLise(){
       lives--;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", lives remain=" + lives +
                '}';
    }
}
