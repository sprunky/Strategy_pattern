package com.hva.strategies;

public class Attack implements Strategy{

    @Override
    public int[] action(int playerHitpoints, int enemyHitpoints) {
        int incomingDamage = (int) (Math.random()*25);
        playerHitpoints = playerHitpoints -incomingDamage;
        System.out.println(String.format("You receive %d damage, your health is %d", incomingDamage, playerHitpoints));
        if (playerHitpoints>0) {
            int damage = (int) (Math.random() * 15);
            enemyHitpoints = enemyHitpoints - damage;
            System.out.println(String.format("You deal %d damage, enemy health is %d", damage, enemyHitpoints));
        }
        return new int[]{playerHitpoints,enemyHitpoints};
    }
}
