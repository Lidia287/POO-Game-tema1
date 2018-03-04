package main;



public class AbilitiesKnight extends Abilities {

public AbilitiesKnight() {

final int magicNum1 = 200;
final int magicNum2 = 30;
final float magicNum3 = 0.2f;
final int magicNum4 = 100;
final int magicNum5 = 40;

executeDamage = magicNum1;
executeDamagePerLevel = magicNum2;

procent = magicNum3;

slamDamage = magicNum4;
slamDamagePerLevel = magicNum5;
}

@Override
void interactWith(final Hero e) {

}

@Override
final void interactWith(final Rogue e) {

float execute  = executeDamage;
float slam = slamDamage;

float hpc = (float) e.hp;


float hplim = procent * hpc;

int hplimInt = Math.round(hplim);

if (e.currentHP < hplimInt) {
e.currentHP = 0; e.alive = false;
} else if (e.currentHP >= hplimInt) {

if (e.currentLand == 'L') {
final float magicNum8 = 1.15f;
float landMod = magicNum8;
execute =  landMod * execute;
slam = landMod * slam;

}


final float magicNum6 = 1.15f;
final float magicNum7 = 0.8f;

float raceMod1 = magicNum6;
float raceMod2 = magicNum7;


execute =  execute * raceMod1; //race modifiers
slam =  slam * raceMod2;

float sum = execute + slam;


int s = Math.round(sum);



e.totalDamage = s;
e.damagePerRound = 0;

e.abilityToMove = false;
e.contorMove = 1;
e.contorRound = 0;
}


}

@Override
final void interactWith(final Wizard e) {


float execute  = executeDamage;
float slam = slamDamage;

float hpc = (float) e.hp;

float hplim = procent * hpc;

int hplimInt = Math.round(hplim);

if (e.currentHP < hplimInt) {
e.currentHP = 0; e.alive = false;
} else if (e.currentHP >= hplimInt) {
if (e.currentLand == 'L') {

final float magicNum8 = 1.15f;
float landMod = magicNum8;
execute =  landMod * execute;
slam = landMod * slam;

}

float dmgWizard = execute + slam;
int dmgWizardInt = Math.round(dmgWizard);
e.damageWizard = dmgWizardInt;

final float magicNum6 = 0.8f;
final float magicNum7 = 1.05f;

float raceMod1 = magicNum6;
float raceMod2 = magicNum7;


execute =  execute * raceMod1; //race modifiers
slam =  slam * raceMod2;

float sum = execute + slam;


int s = Math.round(sum);



e.totalDamage = s;
e.damagePerRound = 0;

e.abilityToMove = false;
e.contorMove = 1;
e.contorRound = 0;
}



}

@Override
final void interactWith(final Knight e) {


float execute  = executeDamage;
float slam = slamDamage;

float hpc = (float) e.hp;

float hplim = procent * hpc;

int hplimInt = Math.round(hplim);

if (e.currentHP < hplimInt) {
e.currentHP = 0; e.alive = false;
} else if (e.currentHP >= hplimInt) {
if (e.currentLand == 'L') {
final float magicNum8 = 1.15f;
float landMod = magicNum8;
execute =  landMod * execute;
slam = landMod * slam;

}

final float magicNum6 = 1.2f;
float raceMod2 = magicNum6;


slam =  slam * raceMod2;

float sum = execute + slam;


int s = Math.round(sum);



e.totalDamage = s;
e.damagePerRound = 0;

e.abilityToMove = false;
e.contorMove = 1;
e.contorRound = 0;
}


}

@Override
final void interactWith(final Pyromancer e) {


float execute  = executeDamage;
float slam = slamDamage;

float hpc = (float) e.hp;

float hplim = procent * hpc;

int hplimInt = Math.round(hplim);

if (e.currentHP < hplimInt) {
e.currentHP = 0; e.alive = false;
} else if (e.currentHP >= hplimInt) {
if (e.currentLand == 'L') {
final float magicNum8 = 1.15f;

float landMod = magicNum8;
execute =  landMod * execute;
slam = landMod * slam;

}

final float magicNum6 = 1.1f;
final float magicNum7 = 0.9f;

float raceMod1 = magicNum6;
float raceMod2 = magicNum7;


execute =  execute * raceMod1; //race modifiers
slam =  slam * raceMod2;

float sum = execute + slam;


int s = Math.round(sum);



e.totalDamage = s;
e.damagePerRound = 0;

e.abilityToMove = false;
e.contorMove = 1;
e.contorRound = 0;
}



}

}
