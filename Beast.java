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
    }

    public String about(){
	return "\n Beast: hulk-like brolic dude(tte) \t Specialty: stupid strong";
    }

    public void specialize(){
	defense -= 5;
	attackRate += 0.4;
    }

    public void normalize(){
	defense += 5;
	attackRate -= 0.4;
    }

}
