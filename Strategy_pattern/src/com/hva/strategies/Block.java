package com.hva.strategies;



public class Block implements Strategy{

    @Override
    public int[] action( int playerHitpoints, int enemyHitpoints) {
        int incomingDamage = (int) (Math.random()*10);
        int block = (int)(Math.random()*15);
        System.out.printf("You can block %d damage this turn\n",block);
        if (block >= incomingDamage){
            System.out.println("You successfully block all damage");
            int damage = block - incomingDamage;
            enemyHitpoints = enemyHitpoints-damage;
            incomingDamage = 0;
            playerHitpoints = playerHitpoints -incomingDamage;
            System.out.println(String.format("You receive %d damage, your health is %d", incomingDamage, playerHitpoints));
            System.out.println(String.format("You shield bash your opponent with your remaining strength"));
            System.out.printf("You deal %d damage with the shieldbash, your enemy has %d remaining.\n",damage,enemyHitpoints);

        } else if (block >0){
           incomingDamage = incomingDamage-block;
            System.out.println(String.format("you partially block incoming damage",incomingDamage));
            playerHitpoints = playerHitpoints -incomingDamage;
            System.out.println(String.format("You receive %d damage, your health is %d", incomingDamage, playerHitpoints));
        }  else {
            System.out.println("epic fail, you dont block at all and your opponent cuts off your head, you instantly die");
            playerHitpoints = 0;
        }




        return new int[]{playerHitpoints,enemyHitpoints};
    }

}
