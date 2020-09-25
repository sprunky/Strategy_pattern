package com.hva;

public class CommandText {
    public CommandText() {
    }

    public static void enemyAttack() {
        System.out.println("Your enemy swings his sword at you");
        System.out.println("Choose your Strategy:");
        System.out.println("a-Attack b-Block h-Heal");
    }
    public static void shieldBash(int playerHitpoints, int enemyHitpoints, int incomingDamage, int damage) {
        System.out.println(String.format("You receive %d damage, your health is %d", incomingDamage, playerHitpoints));
        System.out.println("You shield bash your opponent with your remaining strength");
        System.out.printf("You deal %d damage with the shieldbash, your enemy has %d health remaining.\n",damage,enemyHitpoints);
    }
}