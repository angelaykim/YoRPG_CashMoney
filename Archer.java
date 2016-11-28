//Team Cash Money- Angela K. Tim W.Manahal T.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20

public class Archer extends Character{

    //constructor for class Archer
    public Archer(String newName){
	name = newName;
	HP = 95;
	strength = 90;
	defense = 30;
	attackRate = 0.7;
	specialAttack = 0;
	origHP = 95;
	coins = 20;
	potions = 0;
    }

    //description for character archer
    public String about(){
	return "\n Archer: has a bow and arrow \t Specialty: long range attacks";
    }

    //gets archer ready for specialized attack
    public void specialize(){
	defense -= 5;
	attackRate += 0.1;
    }
    
    //sets the defense and attackRate back to the default values
    public void normalize(){
	defense = 30;
	attackRate = 0.7;
    }
}
