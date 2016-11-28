public class LittleArcher extends Sidekick{
    public LittleArcher(){
	name = "Robin";
	HP =  50;
	strength = 45;
	defense = 15;
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
	HP =  50;
    }
    public void normalize(){
	defense = 15;
	attackRate = 0.7;
    }
}
