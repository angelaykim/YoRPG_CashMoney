public class LittleArcher extends Sidekick{

    //constructor for little archer
    public LittleArcher(){
	name = "Robin";
	HP =  50;
	strength = 45;
	defense = 15;
	attackRate = 0.7;
    }

    //gets little archer ready for a crazy attack
    public void crazyAttack(){
	defense -= 10;
	attackRate += 0.3;
    }

    //gets little archer ready to defend itself
    public void rockDefense(){
	defense += 10;
	attackRate -= 0.3;
    }

    //resets the HP of little archer
    public void reset(){
	HP =  50;
    }

    //sets defense and attackRate back to default values
    public void normalize(){
	defense = 15;
	attackRate = 0.7;
    }
}
