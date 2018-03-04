package main;


//class that will be extended by each type of hero
public abstract class Hero {

protected Abilities abilities;


protected int xp;
protected int hp;
protected int currentHP;
protected int x;
protected int y;

protected int level;

protected int damageWizard;  //used when i need the calculate the deflect damage

protected boolean abilityToMove;

protected int addLevelHP;

protected char currentLand;


protected int totalDamage;
protected int damagePerRound;

protected int contorRound;
protected int contorMove;

protected boolean alive;

protected char type;


public final void setAbilities(final Abilities abilities) {
this.abilities = abilities;
}


public final Abilities getAbilities() {
return this.abilities;
}


public final void setX(final int x) {
this.x = x;
}

public final void setY(final int y) {
this.y = y;
}

public final int getX() {
return this.x;
}

public final int getY() {
return this.y;
}


public final void setHP(final int h) {
this.hp = h;
}

public final int getHP() {
return this.hp;
}



public final void setXP(final int p) {
this.xp = p;
}

public final int getXP() {
return this.xp;
}

public final void setCurrentHP(final int currentHP) {
this.currentHP = currentHP;
}

public final int getCurrentHP() {
return this.currentHP;
}


public final void setLevel(final int level) {
this.level = level;
}

public final int getLevel() {
return this.level;
}


public final void setDamageWizard(final int damageWizard) {
this.damageWizard = damageWizard;
}

public final int getDamageWizard() {
return this.damageWizard;
}


public final void setAbilityToMove(final boolean abilityToMove) {
this.abilityToMove = abilityToMove;
}

public final boolean getAbilityToMove() {
return this.abilityToMove;
}


public final void setAddLevelHP(final int addLevelHP) {
this.addLevelHP = addLevelHP;
}

public final int getAddLevelHP() {
return this.addLevelHP;
}


public final void setCurrentLand(final char currentLand) {
this.currentLand = currentLand;
}

public final char getCurrentLand() {
return this.currentLand;
}


public final void setTotalDamage(final int totalDamage) {
this.totalDamage = totalDamage;
}

public final int getTotalDamage() {
return this.totalDamage;
}


public final void setDamagePerRound(final int damagePerRound) {
this.damagePerRound = damagePerRound;
}

public final int getDamagePerRound() {
return this.damagePerRound;
}


public final void setContorRound(final int contorRound) {
this.contorRound = contorRound;
}

public final int getContorRound() {
return this.contorRound;
}


public final void setContorMove(final int contorMove) {
this.contorMove = contorMove;
}

public final int getContorMove() {
return this.contorMove;
}


public final void setAlive(final boolean alive) {
this.alive = alive;
}

public final boolean getAlive() {
return this.alive;
}

public Hero(final int x, final int y) {

this.x = x;
this.y = y;
damageWizard = 0;
level = 0;
alive = true;
contorRound = 0;
contorMove = 0;
abilityToMove = true;
xp = 0;
totalDamage = 0;
damagePerRound = 0;

}

/**
 * This mehod is based on double dispatch
 * it creates a relationship between the hero and the
 * opponent's abilities.
 * *@param a represents the abilities of the opponent
 */
public void accept(final Abilities a) {
a.interactWith(this);
}


/**
  * This mehod is based on double dispatch
 * it creates a relationship between the hero and the
 * opponent's abilities.
*@param a represents the abilities of the opponent
 */
public void accept(final AbilitiesRogue a) {
a.interactWith(this);
}


/**
 * This mehod is based on double dispatch
 * it creates a relationship between the hero and the
 * opponent's abilities.
*@param a represents the abilities of the opponent
 */
public void accept(final AbilitiesWizard a) {
a.interactWith(this);
}


/**
 * This mehod is based on double dispatch
 * it creates a relationship between the hero and the
 * opponent's abilities.
*@param a represents the abilities of the opponent
 */
public void accept(final AbilitiesKnight a) {
a.interactWith(this);
}


/**
 * This mehod is based on double dispatch
 * it creates a relationship between the hero and the
 * opponent's abilities.
*@param a represents the abilities of the opponent
 */
public void accept(final AbilitiesPyromancer a) {
a.interactWith(this);
}

//method to be overriden by each class , used for levelUp
//it modifies the parameters
public void change() { }

}
