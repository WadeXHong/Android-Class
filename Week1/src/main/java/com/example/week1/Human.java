package com.example.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
/////////////////////////////
//main(String[] args)在最下面
/////////////////////////////
public class Human {
    
    private String name;
    private String weapon;
    private String type;
    private String element;
    private String characterClass;
    Scanner scan = new Scanner(System.in);

    //預設所有職業武器級攻擊方式
    private Map<String,String[][]> weaponMap = new HashMap<String,String[][]>(){
        {
            put("Human",new String[][]{{"Hands"},{"Fist"}});
            put("Hunter",new String[][]{{"Hands","Bow"},{"Fist"},{"Arrow"}});
            put("Warrior",new String[][]{{"Hands","Blade"},{"Fist"},{"Slash","Stab"}});
            put("Mage",new String[][]{{"Hands","Staff"},{"Fist"},{"Missile","Ball","Bolt"}});
        }
    };

    //預設所有職業能用的屬性 (或許可以跟上一個MAP合在一起?)
    private Map<String,String[]> elementMap = new HashMap<String, String[]>(){
        {
            put("Human",new String[]{"Normal"});
            put("Hunter",new String[]{"Normal","Poison","Ice"});
            put("Warrior",new String[]{"Normal","Fire","Stone"});
            put("Mage",new String[]{"Fire","Ice","Lightning","Darkness"});
        }
    };


    //建構子詢問命名
    public Human(){
        setCharacterClass();
        System.out.println("What's your name adventurer ?\n My name is: ");
        setName(scan.next());

    }
    //建構子直接命名
    public Human(String name){
        setCharacterClass();
        setName(name);
    }//人沒武器屬性選QQ

    //依Class名稱定義職業參數characterClass
    public void setCharacterClass(){
        this.characterClass = this.getClass().getSimpleName();
    }

    //回傳characterClass
    public String getCharacterClass(){
        return this.characterClass;
    }

    //設定名稱
    public void setName(String name){
        this.name = name ;
        System.out.println("Hello " + getCharacterClass() + " " + name +" ! Welcome to the adventure of Android Class #1 !\n");
    }

    //回傳名稱
    public String getName(){
        return this.name;
    }

    //設定武器和攻擊方式
    public void setWeaponAndType(String characterClass){
        String weaponChosen; //選擇的武器名稱
        String attackTypeChosen; //選擇的攻擊方式
        int numberInArray = 0; //讀array用數字
        String[] weapons = weaponMap.get(characterClass)[0]; //從預設MAP抽取該職業資料

        //武器選擇
        boolean isInList = false;
            while(!isInList) { //print選擇 判斷是否依清單輸入
                System.out.println("Please choose the weapon you can use. (by input integer number)");
                for (int i=0;i<weapons.length;i++) {
                    System.out.print((i+1) + ":" + weapons[i] + " ");
                }
                System.out.println();
                numberInArray = scan.nextInt();
                if (numberInArray <= weapons.length && numberInArray >0){
                    isInList = true;}else {
                    System.out.println("This selection is NOT in the list !\nPlease choose again !\n");
                }
            }
            weaponChosen = weapons[numberInArray-1];
            System.out.println("Weapon taken: "+ weaponChosen +"\n");
            String[] attackType = weaponMap.get(characterClass)[numberInArray];

        //攻擊方式選擇
        //這邊設true 因為weapons選擇成功會變isInList變成true了
        while(isInList) {
            System.out.println("Please choose the attack method you want. (by input integer number)");
            for (int i = 0; i < attackType.length; i++) {
                System.out.print((i + 1) + ":" + attackType[i] + " ");
            }
            System.out.println();
            numberInArray = scan.nextInt();
            if (numberInArray <= attackType.length && numberInArray > 0) {
                isInList = false;
            } else {
                System.out.println("This selection is NOT in the list !\nPlease choose again !\n");
            }
        }
        attackTypeChosen = attackType[numberInArray - 1];
        System.out.println("Weapon taken: "+ weaponChosen + "\nAttacktype: " + attackTypeChosen +"\n");
        this.type = attackTypeChosen;
        this.weapon = weaponChosen;
    }

    //回傳武器
    public  String getWeapon(){
        return this.weapon;
    }

    //回傳攻擊方式
    public String getType(){
        return this.type;
    }

    //設定附加屬性
    public void setElement(String characterClass) {
        int numberElement = 0;
        boolean isInList = false;
        String elementChosen;
        String[] elements = elementMap.get(characterClass); //從MAP提取職業可用屬性

        while(!isInList){
            System.out.println("Please set your element. (by input integer number)");
            for (int i=0;i<elements.length;i++){
                System.out.print((i+1)+":"+elements[i]+" ");
            }
            System.out.println();
            numberElement = scan.nextInt();
            if (numberElement <= elements.length && numberElement > 0) {
                isInList = true;
            }else
                {System.out.println("This selection is NOT in the list !\nPlease choose again !\n");
            }
        }
        elementChosen = elements[numberElement-1];
        System.out.println("Now you set " + elementChosen + " element on your attack !\n");
        this.element = elementChosen;
    }

    //回傳附加屬性
    public String getElement(){
        return this.element;
    }

    //問要不要打架
    public void askAttack(){
        boolean isYN = false;
        String input;
        while(!isYN) {
            System.out.println("Do you want to attack ? (by input yes or no)");
            input = scan.next().toLowerCase();
            if (input.equals("yes")) {
                attack();
                isYN = true;
            } else if (input.equals("no")) {
                System.out.println("If you don't fight for yourself U R GGGGGG\nGame Over, so do YOUR LIFE\nYOU HAVE BEEN TERMINATED");
                System.exit(1);
            } else {
                System.out.println("Input Yes or No isn't that hard, you have already piss me off = =\n");
            }
        }

    }
    //人類專用攻擊
    public void attack(){
        System.out.println("Fist" + " Attack !");
    }


}
//Human結束

//獵人
class Hunter extends Human{

    public Hunter(){
        super();
        setWeaponAndType(getCharacterClass());
        setElement(getCharacterClass());
        askAttack();
    }
    public Hunter(String name){
        super(name);
        setWeaponAndType(getCharacterClass());
        setElement(getCharacterClass());
        askAttack();
    }

    @Override
    public void attack(){
        System.out.println( getElement() + " " + getType() + " Attack !");
    }
}

class Warrior extends Human{

    public Warrior(){
        super();
        setWeaponAndType(getCharacterClass());
        setElement(getCharacterClass());
        askAttack();
    }
    public Warrior(String name){
        super(name);
        setWeaponAndType(getCharacterClass());
        setElement(getCharacterClass());
        askAttack();
    }

    @Override
    public void attack(){
        System.out.println( getElement() + " " + getType() + " Attack !");
    }
}

class Mage extends Human{

    public Mage(){
        super();
        setWeaponAndType(getCharacterClass());
        setElement(getCharacterClass());
        askAttack();
    }
    public Mage(String name){
        super(name);
        setWeaponAndType(getCharacterClass());
        setElement(getCharacterClass());
        askAttack();
    }

    @Override
    public void attack(){
        System.out.println( getElement() + " " + getType() + " Attack !");

    }
}

class runTheGame{
    public static void main(String[] args){

//        Human player1 = new Human();
//        Human player2 = new Human("Wade");
//        Human player3 = new Hunter();
//        Human player4 = new Hunter("Wade");
//        Human player5 = new Warrior();
//        Human player6 = new Warrior("Wade");
//        Human player7 = new Mage();
//        Human player8 = new Mage("Wade");

    }
}

