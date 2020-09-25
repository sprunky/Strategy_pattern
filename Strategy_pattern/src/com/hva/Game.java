package com.hva;

import com.hva.strategies.Attack;
import com.hva.strategies.Block;
import com.hva.strategies.Heal;

import java.util.Scanner;

public class Game {
    private Attack attack = new Attack();
    private Block block = new Block();
    private Heal heal = new Heal();
    private int playerHitpoints = 100;
    private int enemyHitpoints = 100;
    private boolean gameOn = true;
    private Scanner input = new Scanner(System.in);

    void execute() {
        if (input.next().toUpperCase().equals("Y")) {
            while (gameOn) {
                if (playerDeath(playerHitpoints)) break;
                if (enemyDeath(enemyHitpoints)) break;
                CommandText.enemyAttack();
                int[] playerAndenemyHitpoints = new int[]{playerHitpoints,enemyHitpoints};

                switch (input.next().toUpperCase()) {
                    case "A" -> {
                        playerAndenemyHitpoints = attack.action(playerHitpoints, enemyHitpoints);
                    }
                    case "B" -> {
                        playerAndenemyHitpoints = block.action(playerHitpoints, enemyHitpoints);
                    }
                    case "H" -> {
                        playerAndenemyHitpoints = heal.action(playerHitpoints, enemyHitpoints);
                    }
                }
                updateHitPoints(playerAndenemyHitpoints);
            }
        }
    }

    private boolean playerDeath(int playerHitpoints) {
        if (playerHitpoints < 1) {
           CommandText.youLose();
            gameOn = false;
            return true;
        }
        return false;
    }
    private boolean enemyDeath(int enemyHitpoints) {
        if (enemyHitpoints < 1) {
            CommandText.youWin();
            gameOn = false;
            return true;
        }
        return false;
    }

    private void updateHitPoints(int[] playerAndEnemyHitpoints){
        playerHitpoints = playerAndEnemyHitpoints[0];
        enemyHitpoints = playerAndEnemyHitpoints[1];
    }


}
