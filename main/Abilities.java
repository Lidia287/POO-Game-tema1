package main;

//class that will be extended
//used for characterizing the character's abilities
public class Abilities {

//the parameters needed for Wizard
protected float procent1;
protected float procent1PerLevel;

protected float procent2;
protected float procent2PerLevel;

//the parameters needed for Pyromancer
protected float fireblastDamage;
protected float fireblastDamagePerLevel;

protected float igniteDamage;
protected float igniteDamagePerLevel;
protected float igniteDamageRound;
protected float igniteDamageRoundPerLevel;

//the parameters needed for Knight
protected float executeDamage;
protected float executeDamagePerLevel;

protected float slamDamage;
protected float slamDamagePerLevel;

protected float procent;
protected float procentPerLevel;

//the parameters needed for Rogue
protected float backstabDamage;
protected float backstabDamagePerLevel;
protected float countBackstab;

protected float paralysisDamage;
protected float paralysisDamagePerLevel;

public Abilities() {

}
//methods that will calculate the total damage


void interactWith(final Hero e) {

}

void interactWith(final Rogue e) {

}

void interactWith(final Wizard e) {

}

void interactWith(final Knight e) {

}

void interactWith(final Pyromancer e) {

}

}
