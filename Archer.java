//Manahal Tabassum
//Team Cash Money- Angela K. Tim W.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20

public class Archer extends Character{

    //constructor for class Archer
    public Archer(String newName){
	name = newName;
	HP = 95;
	strength = 90;
	defense = 15;
	attackRate = 0.8;
    }

    public String about(){
	return "\n Archer: has a bow and arrow \t Specialty: long range attacks";
    }

    public void specialize(){
	defense -= 5;
	attackRate += 0.1;
    }

    public void normalize(){
	defense += 5;
	attackRate -= 0.1;
    }
}
