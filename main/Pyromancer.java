package main;

public class Pyromancer extends Hero {

public Pyromancer(final int x, final int y) {
super(x, y);
abilities = new AbilitiesPyromancer();

final int magicNum1 = 500;
final int magicNum2 = 50;
final int magicNum3 = 500;



hp = magicNum1;
addLevelHP = magicNum2;
currentHP = magicNum3;
type = 'P';
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

@Override
public final void change() {

level = level + 1;
hp = hp + addLevelHP;
abilities.fireblastDamage = abilities.fireblastDamage + abilities.fireblastDamagePerLevel;
abilities.igniteDamage = abilities.igniteDamage + abilities.igniteDamagePerLevel;
abilities.igniteDamageRound = abilities.igniteDamageRound + abilities.igniteDamageRoundPerLevel;
currentHP = hp;


}

}
