package org.example;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class FizzBuzz {
    private int maxValue;

    public FizzBuzz(int maxValue) {
        this.maxValue = maxValue;
    }

    public static void main(String[] args) {
        FizzBuzz game = new FizzBuzz(100);
        game.play();
    }

    public void play() {
        for (int i = 1; i <= maxValue; i++) System.out.println(getFizzBuzzValue(i));
    }

    @Contract(pure = true)
    private @NotNull String getFizzBuzzValue(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}