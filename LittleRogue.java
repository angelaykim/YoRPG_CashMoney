public class LittleRogue extends Sidekick{

    //constrcutor for little rogue
    public LittleRogue(){
	name = "Trump";
	HP =  45;
	strength = 35;
	defense = 30;
	attackRate = 0.7;
    }

    //gets little rogue ready for a crazy attack
    public void crazyAttack(){
	defense -= 10;
	attackRate += 0.3;
    }

    //gets little rogue ready to defend itself
    public void rockDefense(){
	defense += 10;
	attackRate -= 0.3;
    }

    //resets the HP of little rogue
    public void reset(){
	HP =  45;
    }

    //sets the defense and attackRate back to the default values
    public void normalize(){
	defense = 30;
	attackRate = 0.7;
    }
}
