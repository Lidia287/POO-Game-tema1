package main;

public class Wizard extends Hero {

public Wizard(final int x, final int y) {
super(x, y);
abilities = new AbilitiesWizard();

final int magicNum1 = 400;
final int magicNum2 = 30;
final int magicNum3 = 400;


hp = magicNum1;
addLevelHP = magicNum2;
currentHP = magicNum3;
type = 'W';
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
abilities.procent1 = abilities.procent1 + abilities.procent1PerLevel;


final float magicNum4 = 0.7f;


if (abilities.procent2 < magicNum4) {
abilities.procent2 = abilities.procent2 + abilities.procent2PerLevel;
}
if (abilities.procent2 > magicNum4) {
abilities.procent2 = magicNum4;
}
currentHP = hp;
}

}
