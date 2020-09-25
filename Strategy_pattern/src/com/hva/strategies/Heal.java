package com.hva.strategies;

public class Heal implements Strategy{
    @Override
    public int[] action( int playerHitpoints, int enemyHitpoints) {
        int incomingDamage = (int) (Math.random()*25);
        playerHitpoints = playerHitpoints -incomingDamage;
        System.out.printf("You receive %d damage, your health is %d\n", incomingDamage, playerHitpoints);
        if (playerHitpoints>0) {
            int heal = (int) (Math.random() * 40);
            playerHitpoints = playerHitpoints + heal;
            System.out.printf("you cast your healing spell and heal %d hitpoints your health is %d\n", heal, playerHitpoints);
        }

        return new int[]{playerHitpoints,enemyHitpoints};



    }
}
