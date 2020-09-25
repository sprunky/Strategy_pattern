package com.hva.strategies;

import com.hva.CommandText;

public class Attack implements Strategy{

    @Override
    public int[] action(int playerHitpoints, int enemyHitpoints) {
        int incomingDamage = (int) (Math.random()*25);
        playerHitpoints = playerHitpoints -incomingDamage;
        CommandText.damageReceived(incomingDamage,playerHitpoints);
        if (playerHitpoints>0) {
            int damage = (int) (Math.random() * 15);
            enemyHitpoints = enemyHitpoints - damage;
            CommandText.damageDealt(damage,enemyHitpoints);
        }
        return new int[]{playerHitpoints,enemyHitpoints};
    }
}
