package com.hva;

import com.hva.strategies.Attack;
import com.hva.strategies.Block;
import com.hva.strategies.Heal;

import java.util.Scanner;

public class Main {
    static Attack attack = new Attack();
    static Block block = new Block();
    static Heal heal = new Heal();
    static int playerHitpoints = 100;
    static int enemyHitpoints = 100;
    static boolean gameOn = true;
    static Scanner input = new Scanner(System.in);
    static String consoleInput;

    public static void main(String[] args) {

        System.out.println("Start game? y/n");
        consoleInput = input.next();

        if (consoleInput.toUpperCase().equals("Y")){
            while (gameOn){
                if (playerHitpoints < 1){
                    System.out.println("You Lose!");
                   gameOn = false;
                   break;
                }
                if (enemyHitpoints < 1){
                    System.out.println("You Win!");
                   gameOn = false;
                   break;
                }
                System.out.println("Your enemy swings his sword at you");
                System.out.println("Choose your Strategy:");
                System.out.println("a-Attack b-Block h-Heal");
                int[] playerAndenemyHitpoints;
                consoleInput = input.next();
                switch (consoleInput.toUpperCase()) {
                    case "A" -> {
                        playerAndenemyHitpoints = attack.action(playerHitpoints, enemyHitpoints);
                        updateHitPoints(playerAndenemyHitpoints);
                    }
                    case "B" -> {
                        playerAndenemyHitpoints = block.action(playerHitpoints, enemyHitpoints);
                        updateHitPoints(playerAndenemyHitpoints);
                    }
                    case "H" -> {
                        playerAndenemyHitpoints = heal.action(playerHitpoints, enemyHitpoints);
                        updateHitPoints(playerAndenemyHitpoints);
                    }
                }

            }
        }


    }

    public static void updateHitPoints(int[] playerAndEnemyHitpoints){
        playerHitpoints = playerAndEnemyHitpoints[0];
        enemyHitpoints = playerAndEnemyHitpoints[1];
    }





    }


