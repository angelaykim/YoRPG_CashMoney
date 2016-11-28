public class LittleWarrior extends Sidekick{

    //constructor for little warrior
    public LittleWarrior(){
	name = "Steph Curry";
	HP =  65;
	strength = 50;
	defense = 20;
	attackRate = 0.5;
    }

    //gets little warrior ready for a crazy attack
    public void crazyAttack(){
	defense -= 10;
	attackRate += 0.3;
    }

    //gets little warrior ready to defend itself
    public void rockDefense(){
	defense += 10;
	attackRate -= 0.3;
    }

    //resets the HP of little warrior
    public void reset(){
	HP =  65;
    }

    //sets the defense and attackRate back to the default values
    public void normalize(){
	defense = 20;
	attackRate = 0.5;
    }
}
