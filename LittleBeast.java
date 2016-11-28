public class LittleBeast extends Sidekick{

    //constructor for Little Beast
    public LittleBeast(){
	name = "Ogre";
	HP = 55;
	strength = 75;
	defense = 20;
	attackRate = 0.3;
    }

    //gets Little Beast ready for a crazy attack
    public void crazyAttack(){
	defense -= 10;
	attackRate += 0.4;
    }

    //gets little beast ready to defend itself
    public void rockDefense(){
	defense += 10;
	attackRate -= 0.2;
    }

    //resets the HP of the littlebeast
    public void reset(){
	HP =  55;
    }

    //sets defense and attackRates back to the default values
    public void normalize(){
	defense = 20;
	attackRate = 0.3;
    }
}
