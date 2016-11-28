public class LittleWarrior extends Sidekick{
    public LittleWarrior(){
	name = "Steph Curry";
	HP =  65;
	strength = 50;
	defense = 20;
	attackRate = 0.5;
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
	HP =  65;
    }
    public void normalize(){
	defense = 20;
	attackRate = 0.5;
    }
}
