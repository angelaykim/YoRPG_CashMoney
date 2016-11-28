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
    protected int specialAttack;
    
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

    public int getSpecialAttack(){
	return specialAttack;
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
	specialAttack += 1;
	return damage;
    }

     public int attack(Sidekick charmander){
	int damage = 0;
	damage = (int)((strength * attackRate) - charmander.getDefense());
	if (damage < 0){
	    damage = 0;
	}
	charmander.lowerHP(damage);
	specialAttack += 1;
	return damage;
    }

    public int specialAttack1(Character smaug){
	int damage = 0;
	damage = (int)((strength * attackRate * 1.5) - smaug.getDefense());
	if (damage < 0){
	    damage = 0;
	}
	smaug.lowerHP(damage);
	specialAttack = 0;
	return damage;
    }

    public int specialAttack2(Character smaug){
	int damage = 0;
	damage = (int)((strength * attackRate * 2) - smaug.getDefense());
	if (damage < 0){
	    damage = 0;
	}
	smaug.lowerHP(damage);
	specialAttack = 0;
	return damage;
    }

    //returns warrior defense and attack rate to default values
    public abstract void normalize();
   
    //gets warrior ready for speacialized attack
    public abstract void specialize();

    public abstract String about();
}
