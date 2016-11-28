//Team Cash Money- Angela K. Tim W.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20

public class Mage extends Character{

    //constructor for class Mage
    public Mage(String newName){
	name = newName;
	HP = 100;
	strength = 80;
	defense = 30;
	attackRate = 0.6;
	specialAttack = 0;
	origHP = 100;
	coins = 20;
	//inventory = new String[5];
	potions = 0;
    }

    public String about(){
	return "\n Mage: magical \t Specialty: enhances strength with their magic";
    }

    public void specialize(){
	defense -= 20;
	attackRate += 0.2;
    }

    public void normalize(){
	defense = 50;
	attackRate = 0.6;
    }
}
