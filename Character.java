//Manahal Tabassum
//Team Cash Money- Angela K. Tim W.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20


public abstract class Character{
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
    //returns damage inflicted on Warrior
    public int attack(Character charmander){
	int damage = 0;
	damage = (int)((strength * attackRate) - charmander.getDefense());
	if (damage < 0){
	    damage = 0;
	}
	charmander.lowerHP(damage);
	return damage;
    }

    //returns warrior defense and attack rate to default values
    public abstract void normalize();
   
    //gets warrior ready for speacialized attack
    public abstract void specialize();

    public abstract String about();
}
