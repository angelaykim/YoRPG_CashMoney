//Manahal Tabassum
//Team Cash Money- Angela K. Tim W.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20


public abstract class Character{

    //instance variables for all characters
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRate;
    protected String name;
    protected int specialAttack;
	protected int coins;
    protected int origHP;
	protected int potions;
    
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

    //accesor method to get the specialAttack value
    public int getSpecialAttack(){
	return specialAttack;
    }
    
    //lowers monster's HP by num
    public void lowerHP(int num){
	HP -= num;
    }
    
    /*returns damage inflicted on the Monster/Character and also lowers the HP of the opposing entity.
      It increases specialAttack by 1 every time it is carried out*/
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

    //returns damage inflicted on the Sidekick by Monster and also lowers the HP of the sidekick.
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

    /*special attack 1 is a stronger attack then simply attack
    it returns the damage done on the Monster while also lowering the HP of the monster
    once this attack is carried out, the specialAttack is set back to 0*/
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
    
    /*This special Attack is stronger than all the other attacks.
      It can only be carried out once specialAttack is greater than or equal to 5.
      It will return the damage done on the Monster and also lowers the HP of the monster*/
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
	//mutator method for coins
	public void setCoins(int coin){
		coins += coin;
	}
	//accessor method for coins
	public int getCoins(){
		return coins;
	}
	//mutator method for potions	
	public void setPotions(int pots){
		if (potions > 5){
			System.out.println("Too many things, sorry.");
			coins+=12;
		}
		else{
		potions += pots;
		}
	}
	//accessor method for potions
	public int getPotions(){
		return potions;
	}
	//effect of potion -- restores to full health when consumed
	public void potionHP(){
		HP = origHP;
    }
    //returns warrior defense and attack rate to default values
    public abstract void normalize();
   
    //gets warrior ready for speacialized attack
    public abstract void specialize();

    //returns a String describing the character
    public abstract String about();
}
