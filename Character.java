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
	protected int coins;
    protected int origHP;
	protected int potions;
    //protected String[] inventory;
	
    
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
	
	public int getCoins(){
		return coins;
	}
	
	public void setCoins(int coin){
		coins += coin;
	}
	
	public void setPotions(int pots){
		if (potions > 5){
			System.out.println("Too many things, sorry.");
			coins+=12;
		}
		else{
		potions += pots;
		}
	}
	
	public int getPotions(){
		return potions;
	}
	
/*	public void setInv(String item){
		int i = 0;
		if (inventory.length > 5){
			System.out.println("Too many things, sorry.");
			coins+=12;
		}
		else{
			while (i < 5){
				if inventory[i].equals(null){
					inventory[i] = item;
				}
				else{
					i+=1;
				}
			}
		}
	}
	
	public String[] invToInv(String[] arr){
		String[] inv;
		for (String s: arr){
			inv += x + " ";
		}
		return inv;
	}

	public String getInv(){
		return invToStr(inventory);
	}
	*/
	
    public void lowerHP(int num){
	HP -= num;
    }
	
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

    public void potionHP(){
	HP = origHP;
    }

 /*   public void potionAR(){
	attackRate = attackRate * 1.25;
    }

    public void potionStr(){
	strength = strength * 1.25;
    }

    public void potionDef(){
	defense = defense * 1.3;	
    }
    */
    //returns warrior defense and attack rate to default values
    public abstract void normalize();
   
    //gets warrior ready for speacialized attack
    public abstract void specialize();

    public abstract String about();
}
