//Team Cash Money- Angela K. Tim W.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20

public class Warrior extends Character{

    //constructor for a warrior
    public Warrior(String newName){
	name = newName;
	HP = 125;
	strength = 100;
	defense = 40;
	attackRate = 0.5;
	specialAttack = 0;
    }
    
    //description for character warrior
    public String about(){
	return "\n Warrior: great for noobz \t Specialty: hand-to-hand combat";
    }

    //gets warrior ready for a specialized attack
    public void specialize(){
	defense -= 10;
	attackRate += 0.2;
    }

    //sets defense and attackRate back to the default values
    public void normalize(){
	defense = 40;
	attackRate = 0.5;
    }
}
