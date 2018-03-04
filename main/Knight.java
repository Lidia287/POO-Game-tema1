package main;

public class Knight extends Hero {

public Knight(final int x, final int y) {
super(x, y);
abilities = new AbilitiesKnight();

final int magicNum1 = 900;
final int magicNum2 = 80;
final int magicNum3 = 900;


hp = magicNum1;
addLevelHP = magicNum2;
currentHP = magicNum3;
type = 'K';
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
abilities.executeDamage = abilities.executeDamage + abilities.executeDamagePerLevel;
abilities.slamDamage = abilities.slamDamage + abilities.slamDamagePerLevel;
currentHP = hp;

final float magicNum4 = 0.4f;



if (abilities.procent < magicNum4) {
abilities.procent = abilities.procent + abilities.procentPerLevel;
}
if (abilities.procent > magicNum4) {
abilities.procent = magicNum4;
}


}

}
