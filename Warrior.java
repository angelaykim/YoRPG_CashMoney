//Team Cash Money- Angela K. Tim W.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20

public class Warrior extends Character{

    //gives the warrior a name
    public Warrior(String newName){
	name = newName;
	HP = 125;
	strength = 100;
	defense = 40;
	attackRate = 0.5;
	specialAttack = 0;
	origHP = 125;
	coins = 20;
	//inventory = new String[5];
	potions = 0;
    }

    public String about(){
	return "\n Warrior: great for noobz \t Specialty: hand-to-hand combat";
    }

    public void specialize(){
	defense -= 10;
	attackRate += 0.2;
    }

    public void normalize(){
	defense = 40;
	attackRate = 0.5;
    }
}
