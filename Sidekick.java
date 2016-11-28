public abstract class Sidekick{

    //instance variables for all Sidekicks
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRate;
    protected String name;

     //if HP is greater than 0, then alive; else, dead
    public boolean isAlive(){
	return HP > 0;
    }

    //accesor method to get name value
    public String getName(){
	return name;
    }
    
    //accessor --  returns defense
    public int getDefense(){
	return defense;
    }

    //lowers monster's HP by num
    public void lowerHP(int num){
	HP -= num;
    }
    //returns damage inflicted on Monster and also lowers the HP of the monster
    public int attack(Monster charmander){
	int damage = 0;
	damage = (int)((strength * attackRate) - charmander.getDefense());
	if (damage < 0){
	    damage = 0;
	}
	charmander.lowerHP(damage);
	return damage;
    }

    public abstract void reset();
    public abstract void crazyAttack();
    public abstract void rockDefense();
    public abstract void normalize();
}
	
        
