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
	potions = 0;
    }

    //description for character Mage
    public String about(){
	return "\n Mage: magical \t Specialty: enhances strength with their magic";
    }

    //gets Mage ready for a specialized attack
    public void specialize(){
	defense -= 20;
	attackRate += 0.2;
    }

    //sets defense and attackRate back to default values
    public void normalize(){
	defense = 50;
	attackRate = 0.6;
    }
}
