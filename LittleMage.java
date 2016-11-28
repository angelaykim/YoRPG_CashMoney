public class LittleMage extends Sidekick{

    //constructor for little mage
    public LittleMage(){
	name = "Albus";
	HP =  55;
	strength = 40;
	defense = 15;
	attackRate = 0.6;
    }

    //gets little mage ready for a crazy attack
    public void crazyAttack(){
	defense -= 5;
	attackRate += 0.4;
    }

    //gets little mage ready to defend itself
    public void rockDefense(){
	defense += 10;
	attackRate -= 0.3;
    }

    //resets the HP of the little mage
    public void reset(){
	HP =  55;
    }

    //sets defense and attackRate back to the default values
    public void normalize(){
	defense = 15;
	attackRate = 0.6;
    }
}
