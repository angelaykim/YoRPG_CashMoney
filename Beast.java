//Team Cash Money- Angela K. Tim W. Manahal T.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20

public class Beast extends Character{

    //constructor for class Beast
    public Beast(String newName){
	name = newName;
	HP = 100;
	strength = 150;
	defense = 40;
	attackRate = 0.3;
	specialAttack = 0;
	origHP = 100;
	coins = 20;
	potions = 0;
    }

    //description for character Beast
    public String about(){
	return "\n Beast: hulk-like brolic dude(tte) \t Specialty: stupid strong";
    }

    //gets beast ready for a specialized attack
    public void specialize(){
	defense -= 5;
	attackRate += 0.4;
    }
    
    //sets defense and attackRate back to default values
    public void normalize(){
	defense = 40;
	attackRate = 0.3;
    }

}
