package com.hva;

public class GameLogic {
    private boolean playerDeath(int playerHitpoints) {
        if (playerHitpoints < 1) {
            System.out.println("You Lose!");
            return true;
        }
        return false;
    }
    private boolean enemyDeath(int enemyHitpoints) {
        if (enemyHitpoints < 1) {
            System.out.println("You Win!");
            return true;
        }
        return false;
    }

}
