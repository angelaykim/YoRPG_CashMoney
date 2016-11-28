public class LittleMage extends Sidekick{
    public LittleMage(){
	name = "Albus";
	HP =  55;
	strength = 40;
	defense = 15;
	attackRate = 0.6;
    }
    public void crazyAttack(){
	defense -= 5;
	attackRate += 0.4;
    }
    public void rockDefense(){
	defense += 10;
	attackRate -= 0.3;
    }
    public void reset(){
	HP =  55;
    }
    public void normalize(){
	defense = 15;
	attackRate = 0.6;
    }
}
