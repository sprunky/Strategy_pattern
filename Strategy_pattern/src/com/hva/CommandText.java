package com.hva;

public class CommandText {
    public CommandText() {
    }

    public static void start(){
        System.out.println("Start game? y/n");
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
    public static void youLose(){
        System.out.println("You Lose!");
    }
    public static void youWin(){
        System.out.println("You Win!");
    }
    public static void damageReceived(int incomingDamage, int playerHitpoints){
        System.out.println(String.format("You receive %d damage, your health is %d", incomingDamage, playerHitpoints));
    }

    public static void damageDealt(int damage, int enemyHitpoints){
        System.out.println(String.format("You deal %d damage, enemy health is %d", damage, enemyHitpoints));
    }
}