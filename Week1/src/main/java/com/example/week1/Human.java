package com.example.week1;//import java.io.Console;


import java.util.Scanner;

import javax.print.StreamPrintService;

/**
 **************** Tips ****************
 * * Jobs: com.example.week1.Hunter, com.example.week1.Warrior, com.example.week1.Mage
 * * Weapons and Skills:
 * * -----------------------------------
 * * | Default Blade | Slash         |
 * * | Fire Blade    | Fire Slash    |
 * * | Ice Blade     | Ice Slash      |
 * * -----------------------------------
 * * | Default Bow   | Arrow       |
 * * | Fire Bow      | Fire Arrow  |
 * * | Ice Bow       | Ice Arrow    |
 * * -----------------------------------
 * * | Default Staff | Arcane Missiles |
 * * | Fire Staff    | Fireball        |
 * * | Ice Staff     | Frostbolt       |
 * * -----------------------------------
 * *
 */

public class Human {

    //Console console = System.console();
    private String name;
    private String weapon;
    public final static String FIRE = "1";
    public final static String ICE = "2";



    //建構子
    public Human(){
        System.out.println("What's your name Adventurer ?\n My name is: ");
        Scanner scan = new Scanner(System.in);
        setName(scan.next());

    }
    //建構子
    public Human(String name){
        setName(name);
    }


    public void setName(String name){
        this.name = name ;
        System.out.println("Hello "+ name +" ! Welcome to the adventure of Android Class #1 !");
    }
    public String getName(){
        return this.name;
    }
    //方法->攻擊
    public void attack(){
        System.out.println("Fist" + " Attack !");
    }


}

class Hunter extends Human{

    Scanner scan = new Scanner(System.in);
    //String fireOrIce = null;
    private String weapon = "Bow";

    public String setFireOrIce(String i){
        String fireOrIce = null;
        boolean isFireOrIce = false;
        while(!isFireOrIce){
            switch (i){
                case "1":
                    isFireOrIce = true;
                    fireOrIce = "FIRE";break;
                case "2":
                    isFireOrIce = true;
                    fireOrIce = "ICE";break;
                default:
                    fireOrIce = null;
                    System.out.println("input 1 or 2 (fire or ice) to enhance your weapon");
                    i = scan.next();
            }
        }
        return fireOrIce;
    }


    @Override
    public void attack(){
        System.out.println("input 1 or 2 (fire or ice) to enhance your weapon");
        System.out.println(weapon +" "+setFireOrIce(scan.next()) + " Attack !");

    }

    public Hunter(){
        super();
    }
    public Hunter(String name){
        super(name);
    }


}
class Warrior extends Human{
    private String[] weaponList = {"Fist","Blade"};
}
class Mage extends Human{
    private String[] weaponList = {"Fist","Staff"};
}

class runTheGame{
    public static void main(String[] args){

        Human player = new Human("Wade");
        player.attack();
        Hunter player2 = new Hunter("Wade");
        player2.attack();
    }
}

