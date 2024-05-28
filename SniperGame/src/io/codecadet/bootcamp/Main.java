package io.codecadet.bootcamp;

public class Main {
    public static void main(String[] args) {
        SniperRifle sniperRifle = new SniperRifle(50);

        //Create a soldier enemy
        SoldierEnemy soldierEnemy = new SoldierEnemy("A Soldier enemy appears!", 50);
        sniperRifle.shoot(soldierEnemy);
        if (soldierEnemy.checkHealth()) {
            System.out.println("The soldier enemy is dead!");
        } else {
            System.out.println("The soldier enemy is still alive!");
        }

        // create an armoured enemy
        ArmouredEnemy armouredEnemy = new ArmouredEnemy("An armour enemy appears!", 50, 50);
        sniperRifle.shoot(armouredEnemy);
        if (armouredEnemy.checkHealth()) {
            System.out.println("The armoured enemy is dead!");
        } else {
            System.out.println("The armoured enemy is still alive!");
        }

        //create a tree
        Tree tree = new Tree("A tree his in the way!");
        tree.cannotShoot();//this will print "you cannot shoot a tree!"
    }
}