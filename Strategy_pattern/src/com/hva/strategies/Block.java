package com.hva.strategies;


import com.hva.CommandText;

public class Block implements Strategy{

    @Override
    public int[] action( int playerHitpoints, int enemyHitpoints) {
        int incomingDamage = (int) (Math.random()*25);
        int block = (int)(Math.random()*35);
        System.out.printf("You can block %d damage this turn\n",block);
        if (block >= incomingDamage){
            System.out.println("You successfully block all damage");
            int damage = (block - incomingDamage)/2;
            enemyHitpoints = enemyHitpoints-damage;
            incomingDamage = 0;
            playerHitpoints = playerHitpoints -incomingDamage;
            CommandText.shieldBash(playerHitpoints, enemyHitpoints, incomingDamage, damage);
        } else if (block >0){
           incomingDamage = incomingDamage-block;
            System.out.println("you partially block incoming damage");
            playerHitpoints = playerHitpoints -incomingDamage;
            System.out.println(String.format("You receive %d damage, your health is %d", incomingDamage, playerHitpoints));
        }  else {
            System.out.println("Legendary failure, you dont block at all and your opponent cuts off your head, you instantly die");
            playerHitpoints = 0;
        }

        return new int[]{playerHitpoints,enemyHitpoints};
    }



}
