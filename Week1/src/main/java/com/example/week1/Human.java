package com.example.week1;//import java.io.Console;


import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
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
    private String characterClass = "Human";
    Scanner scan = new Scanner(System.in);
    public final static String FIRE = "1";
    public final static String ICE = "2";
    private static Map<String,String[]> weapon2 = new HashMap<String,String[]>(){
        {
            put("Human",new String[]{"Fist"});
            put("Hunter",new String[]{"Fist","Bow"});
            put("Warrior",new String[]{"Fist","Blade"});
            put("Mage",new String[]{"Fist","Staff"});
        }
    };
    private static Map<String,String[]> element = new HashMap<String, String[]>(){
        {
            put("Human",new String[]{"Nothing"});
            put("Hunter",new String[]{"Nothing","Poison","Ice"});
            put("Warrior",new String[]{"Nothing","Fire","Stone"});
            put("Mage",new String[]{"Fire","Ice","Lightning","Darkness"});
        }
    };


    //建構子
    public Human(){
        System.out.println("What's your name Adventurer ?\n My name is: ");
        setName(scan.next());
        setWeapon(characterClass);
        setElement(characterClass);

    }
    //建構子 SETWEAPON()嘗試
    public Human(String name){
        setName(name);
        setWeapon(characterClass);
        setElement(characterClass);

    }


    public void setName(String name){
        this.name = name ;
        System.out.println("Hello "+ name +" ! Welcome to the adventure of Android Class #1 !");
    }
    public String getName(){
        return this.name;
    }


    public String setWeapon(String characterClass){
        String weaponChoose;
        int numberWeapon = 0;
        String[] weapons = weapon2.get(characterClass);
        boolean isInList = false;
            while(!isInList) {
                System.out.print("Please choose the weapon you can use ");
                for (String i : weapons) {
                    System.out.print(i + " ");
                }
                System.out.println();
                numberWeapon = scan.nextInt();
                if (numberWeapon <= weapons.length && numberWeapon >0){
                    isInList = true;}
            }
            weaponChoose = weapons[numberWeapon-1] ;
        System.out.println("Now you can use "+ weaponChoose + " to attack!");

        return weaponChoose;
    }

    public String setElement(String characterClass) {
        int numberElement = 0;
        boolean isInList = false;
        String elementChoose;
        String[] elements = element.get(characterClass);

        while(!isInList){
            System.out.print("Please set your element ");
            for (String i:elements){
                System.out.print(i +" ");
            }
            System.out.println();
            numberElement = scan.nextInt();
            if (numberElement <= elements.length && numberElement > 0) {
                isInList = true;
            }
        }
        elementChoose = elements[numberElement-1];
        System.out.println("Now you set " + elementChoose + " on your weapon !");
        return elementChoose;
    }




    //方法->攻擊
    public void attack(){
        System.out.println("Fist" + " Attack !");
    }


}

class Hunter extends Human{

    //Scanner scan = new Scanner(System.in);
    //String fireOrIce = null;
    private String weapon = "Bow";
    private String characterClass = "Hunter";



    @Override
    public void attack(){
        System.out.println("input 1 or 2 (fire or ice) to enhance your weapon");
        System.out.println(weapon +" "+setElement(scan.next()) + " Attack !");

    }

    public Hunter(){
        //super();
    }
    public Hunter(String name){
        setName(name);
        setWeapon(characterClass);
        setElement(characterClass);
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


//        Human player = new Human("Wade");
//        player.attack();
        Hunter player2 = new Hunter("Wade");
//        player2.attack();
    }
}

