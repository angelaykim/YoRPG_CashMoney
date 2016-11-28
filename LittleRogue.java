public class LittleRogue extends Sidekick{
    public LittleRogue(){
	name = "Trump";
	HP =  45;
	strength = 35;
	defense = 30;
	attackRate = 0.7;
    }
    public void crazyAttack(){
	defense -= 10;
	attackRate += 0.3;
    }
    public void rockDefense(){
	defense += 10;
	attackRate -= 0.3;
    }
    public void reset(){
	HP =  45;
    }
    public void normalize(){
	defense = 30;
	attackRate = 0.7;
    }
}
