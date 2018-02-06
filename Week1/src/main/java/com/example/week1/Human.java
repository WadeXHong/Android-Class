package com.example.week1;//import java.io.Console;
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

    //建構子
    public Human(){
        System.out.println("What's your name Adventurer ?");
        setWeapon();
    }
    //建構子
    public Human(String name){
        this.name = name;
        System.out.println("Hello "+ name +" ! Welcome to the Android Class #1 !");
        setWeapon();
    }

    //方法->攻擊
    public void attack(){
        //console.printf("%s Attack !",getWeapon());
        System.out.print(getWeapon()+" Attack !");
    }

    public void setWeapon(){
        this.weapon = "Fist";
    }


    public String getWeapon(){
        return this.weapon;
    }
}

class Hunter extends Human{

}
class Warrior extends Human{
}
class Mage extends Human{
}

class runTheGame{
    public static void main(String[] args){
        Human theFirstPlayer = new Human("Wade");
    }
}

