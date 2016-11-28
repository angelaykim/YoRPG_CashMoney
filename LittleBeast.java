public class LittleBeast extends Sidekick{
    public LittleBeast(){
	name = "Ogre";
	HP = 55;
	strength = 75;
	defense = 20;
	attackRate = 0.3;
    }
    public void crazyAttack(){
	defense -= 10;
	attackRate += 0.4;
    }
    public void rockDefense(){
	defense += 10;
	attackRate -= 0.2;
    }
    public void reset(){
	HP =  55;
    }
    public void normalize(){
	defense = 20;
	attackRate = 0.3;
    }
}
