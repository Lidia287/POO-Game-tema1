package main;

public class Rogue extends Hero {

public Rogue(final int x, final int y) {
super(x, y);
abilities = new AbilitiesRogue();

final int magicNum1 = 600;
final int magicNum2 = 40;
final int magicNum3 = 600;


hp = magicNum1;
addLevelHP = magicNum2;
currentHP = magicNum3;
type = 'R';
}

public final void accept(final Abilities a) {
a.interactWith(this);
}

public final void accept(final AbilitiesRogue a) {
a.interactWith(this);
}

public final void accept(final AbilitiesWizard a) {
a.interactWith(this);
}


public final void accept(final AbilitiesKnight a) {
a.interactWith(this);
}

public final void accept(final AbilitiesPyromancer a) {
a.interactWith(this);
}


public final void change() {

level = level + 1;
hp = hp + addLevelHP;
abilities.backstabDamage = abilities.backstabDamage + abilities.backstabDamagePerLevel;
abilities.paralysisDamage = abilities.paralysisDamage + abilities.paralysisDamagePerLevel;
currentHP = hp;

}

}
