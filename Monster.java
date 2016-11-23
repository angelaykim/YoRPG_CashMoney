//Team Cash Money- Angela K. Tim W. Manahal T.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20

public class Monster extends Character{

    //initializes attributes
    public Monster(){
	HP = 150;
	strength = (int)(Math.random()*45+20);
	defense = 20;
	attackRate = 0.5;
	name = "voldemort";
    }

    public String about(){
	return "";
    }

    public void specialize(){
    }

    public void normalize(){
    }
    
}
