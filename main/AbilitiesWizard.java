package main;




public class AbilitiesWizard extends Abilities {

public AbilitiesWizard() {


final float magicNum1 = 0.2f;
final float magicNum2 = 0.05f;
final float magicNum3 = 0.35f;
final float magicNum4 = 0.02f;

procent1 = magicNum1;
procent1PerLevel = magicNum2;


procent2 = magicNum3;
procent2PerLevel = magicNum4;


}

final void interactWith(final Hero e) {

}

final void interactWith(final Rogue e) {

float drainProcent = procent1;
float deflectProcent = procent2;


if (e.currentLand == 'D') {
final float magicNum5 = 1.1f;
float landMod = magicNum5;
drainProcent = drainProcent * landMod;
deflectProcent = deflectProcent * landMod;

}

final float magicNum6 = 0.3f;
float hpbaza = 0;
if (magicNum6 * e.hp <= e.currentHP) {
hpbaza = (float) (magicNum6 * e.hp);
} else if (magicNum6 * e.hp > e.currentHP) {
hpbaza = (float) (e.currentHP);
}


final float raceMod1 = (float) (0.8);
final float raceMod2 = (float) (1.2);
drainProcent = drainProcent * raceMod1;  //race modifiers
deflectProcent = deflectProcent * raceMod2;

float dmgWizard = (float) e.damageWizard;

float drain = drainProcent * hpbaza;
float deflect = deflectProcent * dmgWizard;


float sum = drain + deflect;


int s = Math.round(sum);


e.totalDamage = s;






}

final void interactWith(final Wizard e) {


float drainProcent = procent1;



if (e.currentLand == 'D') {
final float landMod = (float) (1.1);
drainProcent = drainProcent * landMod;


}

final float magicNum5 = 0.3f;
float hpbaza = 0;
if (magicNum5 * e.hp <= e.currentHP) {
hpbaza = (float) (magicNum5 * e.hp);
} else if (magicNum5 * e.hp > e.currentHP) {
hpbaza = (float) (e.currentHP);
}


final float raceMod1 = (float) (1.05);

drainProcent = drainProcent * raceMod1;  //race modifiers


float dmgWizard = (float) e.damageWizard;

float drain = drainProcent * hpbaza;



float sum = drain;


int s = Math.round(sum);


e.totalDamage = s;



}

final void interactWith(final Pyromancer e) {

float drainProcent = procent1;
float deflectProcent = procent2;

final float raceMod1 = (float) (0.9);
final float raceMod2 = (float) (1.3);

float hpbaza = 0;
final float magicNum5 = 0.3f;
if (magicNum5 * e.hp <= e.currentHP) {
hpbaza = (float) (magicNum5 * e.hp);
} else if (magicNum5 * e.hp > e.currentHP) {
hpbaza = (float) (e.currentHP);
}

if (e.currentLand == 'D') {
if (e.currentLand == 'D') {
final float landMod = (float) (1.1);
drainProcent = drainProcent * landMod;
deflectProcent = deflectProcent * landMod;

}


drainProcent = drainProcent * raceMod1;  //race modifiers
deflectProcent = deflectProcent * raceMod2;

float dmgWizard = (float) e.damageWizard;

float drain = drainProcent * hpbaza;
float deflect = deflectProcent * dmgWizard;

float sum = drain + deflect;
int s = Math.round(sum);
e.totalDamage = s;
}


if (e.currentLand != 'D') {



float dmgWizard = (float) e.damageWizard;

float drain = drainProcent * hpbaza;
float deflect = deflectProcent * dmgWizard;

int drainInt = Math.round(drain);
int deflectInt = Math.round(deflect);

float drainFloat = (float) drainInt;
float deflectFloat = (float) deflectInt;



int drIn = Math.round(drainFloat);
int dfIn = Math.round(deflectFloat);

float drFl = (float) drIn;
float dfFl = (float) dfIn;

drFl = drFl * raceMod1;  //race modifiers
dfFl = dfFl * raceMod2;




float sum = drFl + dfFl;


int s = Math.round(sum);
e.totalDamage = s;
}
}

final void interactWith(final Knight e) {


float drainProcent = procent1;
float deflectProcent = procent2;


if (e.currentLand == 'D') {
final float landMod = (float) (1.1);
drainProcent = drainProcent * landMod;
deflectProcent = deflectProcent * landMod;

}

float hpbaza = 0;
final float magicNum5 = 0.3f;
if (magicNum5 * e.hp <= e.currentHP) {
hpbaza = (float) (magicNum5 * e.hp);
} else if (magicNum5 * e.hp > e.currentHP) {
hpbaza = (float) (e.currentHP);
}


final float raceMod1 = (float) (1.2);
final float raceMod2 = (float) (1.4);
drainProcent = drainProcent * raceMod1;  //race modifiers
deflectProcent = deflectProcent * raceMod2;

float dmgWizard = (float) e.damageWizard;

float drain = drainProcent * hpbaza;
float deflect = deflectProcent * dmgWizard;


float sum = drain + deflect;


int s = Math.round(sum);


e.totalDamage = s;

}

}
