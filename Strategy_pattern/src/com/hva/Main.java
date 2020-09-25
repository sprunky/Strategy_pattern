package com.hva;

import com.hva.strategies.Attack;
import com.hva.strategies.Block;
import com.hva.strategies.Heal;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Start game? y/n");
        Game game = new Game();
        game.execute();
    }
}


