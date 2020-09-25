package com.hva.strategies;

public class Heal implements Strategy{
    @Override
    public int[] action( int playerHitpoints, int enemyHitpoints) {
        int incomingDamage = (int) (Math.random()*10);
        playerHitpoints = playerHitpoints -incomingDamage;
        System.out.println(String.format("You receive %d damage, your health is %d", incomingDamage, playerHitpoints));
        int heal = (int)(Math.random()*15);
        playerHitpoints = playerHitpoints+heal;
        System.out.printf("you cast your healing spell and heal %d hitpoints your health is %d",heal,playerHitpoints);

        return new int[]{playerHitpoints,enemyHitpoints};



    }
}
