package com.hangedMan;

public class Player {
   private String name;
   private int lives;
   private int score=0;
   public Player(){
        lives=5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void decrementLife(){
       lives--;
    }
    public void incrementScore(){
       score++;
    }

    public  String getScore(){
       return  "name='" + name + '\'' + ", you won with score=" + score ;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", attempts remain=" + lives ;
    }
}
