package com.hangedMan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private List<Character> toGuess;
    private List<Character> guessed = new ArrayList<Character>();
    private Consumer<String> consumer=System.out::print;
    private Player player = getPlayerName();

    public void startGame() {

        toGuess = Util.splitWord(Util.getRandomWord());
        System.out.println(toGuess);
        addingFirstAndLastCharsToGuessed();
        while (!guessed.containsAll(toGuess) && player.getLives() > 0) {
            outputGuessedChars();
            consumer.accept("Your's guess: ");
            inputGuess();
        }

        if (player.getLives() < 1) {
            consumer.accept(player.getName() + " " + "You lost");
            setInitialState();
        } else if (guessed.containsAll(toGuess)) {
            outputGuessedChars();
            consumer.accept(player.getScore());
        }
        System.out.println();
        consumer.accept("Continue game?(yes/no) ");
        String question = scanner.next();
        if (question.toLowerCase().equals("yes") || question.toLowerCase().equals("y")) {
            startGame();
        }

    }


    private Player getPlayerName() {
        System.out.println("Please write your name");
        Player player = new Player();
        try {

            player.setName(scanner.next());
        } catch (Exception e) {
            System.out.println("Please try again");
            getPlayerName();

        }
        return player;
    }

    public void addingFirstAndLastCharsToGuessed() {
        guessed.add(toGuess.get(0));
        guessed.add(toGuess.get(toGuess.size() - 1));

    }

    private void outputGuessedChars() {
        List<Character> temp = toGuess.stream().
                map(x -> {
                    if (guessed.contains(x)) return x;
                    else return '_';
                }).collect(Collectors.toList());
        System.out.print(temp);
        System.out.println();
    }

    private void inputGuess() {

        String input = scanner.next();
        if (Util.checkingForValidInput(input)) {
            guessed.add(input.toCharArray()[0]);
        }

        if (!toGuess.contains(input.charAt(0))) {
            player.decrementLife();
        } else {
            player.incrementScore();
        }


    }

    public void setInitialState() {
        player.setScore(0);
        player.setLives(5);
        guessed.clear();
    }


}
