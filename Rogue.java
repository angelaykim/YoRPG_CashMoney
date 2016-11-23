//Manahal Tabassum
//Team Cash Money- Angela K. Tim W.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20

public class Rogue extends Character{

    //constructor for class Rogue
    public Rogue(String newName){
	name = newName;
	HP = 70;
	strength = 50;
	defense = 65;
	attackRate = 1.0;
    }

    public String about(){
	return "\n Rogue: master of stealth \t Specialty: sneak attack";
    }

    public void specialize(){
	defense -= 15;
	attackRate += 0.1;
    }

    public void normalize(){
	defense += 15;
	attackRate -= 0.1;
    }
}
