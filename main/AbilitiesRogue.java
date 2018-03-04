package main;



public class AbilitiesRogue extends Abilities {

public AbilitiesRogue() {

final int magicNum1 = 200;
final int magicNum2 = 20;
final int magicNum3 = 0;
final int magicNum4 = 40;
final int magicNum5 = 10;



backstabDamage = magicNum1;
backstabDamagePerLevel = magicNum2;

countBackstab = magicNum3;

paralysisDamage = magicNum4;
paralysisDamagePerLevel = magicNum5;


}

final void interactWith(final Hero e) {


}

@Override
final void interactWith(final Rogue e) {


float backstab = backstabDamage;
float paralysis = paralysisDamage;


if (e.currentLand == 'W')  {

final float magicNum6 = 1.15f;
float landMod = magicNum6;
backstab = backstab * landMod;
paralysis = paralysis * landMod;

}


final int magicNum8 = 3;
if (countBackstab % magicNum8 == 0) {
if (e.currentLand == 'W') {

final float magicNum7 = 1.5f;
float inmultit = magicNum7;
backstab = inmultit * backstab;
countBackstab = countBackstab + 1;
} else {
countBackstab = countBackstab + 1;
}
} else if (countBackstab % magicNum8 != 0) {

countBackstab = countBackstab + 1;
}

final float magicNum9 = 1.2f;
final float magicNum10 = 0.9f;

float raceMod1 = magicNum9;
float raceMod2 = magicNum10;
 backstab = backstab * raceMod1;  //race modifiers
paralysis = paralysis * raceMod2;

float sum = backstab + paralysis;
float partialSum = paralysis;

int s = Math.round(sum);
int pS = Math.round(partialSum);

e.totalDamage = s;
e.damagePerRound = pS;

if (e.currentLand == 'W') {
e.abilityToMove = false;
final int magicNum11 = 6;
e.contorRound = magicNum11;
e.contorMove = magicNum11;
} else {
final int magicNum12 = 3;
e.abilityToMove = false;
e.contorRound = magicNum12;
e.contorMove = magicNum12;
}


}

final void interactWith(final Wizard e) {


float backstab = backstabDamage;
float paralysis = paralysisDamage;


if (e.currentLand == 'W') {

final float magicNum6 = 1.15f;
float landMod = magicNum6;
backstab = backstab * landMod;
paralysis = paralysis * landMod;

}


final int magicNum7 = 3;
if (countBackstab % magicNum7 == 0) {
if (e.currentLand == 'W') {
final float magicNum8 = 1.5f;
float inmultit = magicNum8;
backstab = inmultit * backstab;
countBackstab = countBackstab + 1;
} else {
countBackstab = countBackstab + 1;
}
} else if (countBackstab % magicNum7 != 0) {

countBackstab = countBackstab + 1;
}


float dmgWizard = backstab + paralysis;
int dmgWizardInt = Math.round(dmgWizard);
e.damageWizard = dmgWizardInt;


final float magicNum9 = 1.25f;

float raceMod1 = magicNum9;
float raceMod2 = magicNum9;
backstab = backstab * raceMod1;  //race modifiers
paralysis = paralysis * raceMod2;

float sum = backstab + paralysis;
float partialSum = paralysis;

int s = Math.round(sum);
int pS = Math.round(partialSum);

e.totalDamage = s;
e.damagePerRound = pS;



if (e.currentLand == 'W') {
final int magicNum10 = 6;
e.abilityToMove = false;
e.contorRound = magicNum10;
e.contorMove = magicNum10;
} else {
final int magicNum11 = 3;
e.abilityToMove = false;
e.contorRound = magicNum11;
e.contorMove = magicNum11;
}



}

final void interactWith(final Knight e) {

float backstab = backstabDamage;
float paralysis = paralysisDamage;


if (e.currentLand == 'W') {
final float magicNum6 = 1.15f;
float landMod = magicNum6;
backstab = backstab * landMod;
paralysis = paralysis * landMod;

}


final int magicNum7 = 3;
if (countBackstab % magicNum7 == 0) {
if (e.currentLand == 'W') {
final float magicNum12 = 1.5f;
float inmultit = magicNum12;
backstab = inmultit * backstab;
countBackstab = countBackstab + 1;
} else {
countBackstab = countBackstab + 1;
}
} else if (countBackstab % magicNum7 != 0) {

countBackstab = countBackstab + 1;
}

final float magicNum8 = 0.9f;
final float magicNum9 = 0.8f;
float raceMod1 = magicNum8;
float raceMod2 = magicNum9;
backstab = backstab * raceMod1;  //race modifiers
paralysis = paralysis * raceMod2;

int backInt = Math.round(backstab);
int paraInt = Math.round(paralysis);
int s = backInt + paraInt;


float partialSum = paralysis;


int pS = Math.round(partialSum);

e.totalDamage = s;
e.damagePerRound = pS;

if (e.currentLand == 'W') {
final int magicNum10 = 6;
e.abilityToMove = false;
e.contorRound = magicNum10;
e.contorMove = magicNum10;
} else {
final int magicNum11 = 3;
e.abilityToMove = false;
e.contorRound = magicNum11;
e.contorMove = magicNum11;
}


}

final void interactWith(final Pyromancer e) {

float backstab = backstabDamage;
float paralysis = paralysisDamage;


if (e.currentLand == 'W') {
final float magicNum6 = 1.15f;
float landMod = magicNum6;
backstab = backstab * landMod;
paralysis = paralysis * landMod;

}


final int magicNum7 = 3;
if (countBackstab % magicNum7 == 0) {
if (e.currentLand == 'W') {
final float magicNum8 = 1.5f;
float inmultit = magicNum8;
backstab = inmultit * backstab;
countBackstab = countBackstab + 1;
} else {
countBackstab = countBackstab + 1;
}
} else if (countBackstab % magicNum7 != 0) {

countBackstab = countBackstab + 1;
}

final float magicNum9 = 1.25f;
final float magicNum10 = 1.2f;

float raceMod1 = magicNum9;
float raceMod2 = magicNum10;
 backstab = backstab * raceMod1;  //race modifiers
 paralysis = paralysis * raceMod2;

float sum = backstab + paralysis;
float partialSum = paralysis;

int s = Math.round(sum);
int pS = Math.round(partialSum);

e.totalDamage = s;
e.damagePerRound = pS;

if (e.currentLand == 'W') {
final int magicNum11 = 6;
e.abilityToMove = false;
e.contorRound = magicNum11;
e.contorMove = magicNum11;
} else {
final int magicNum12 = 3;
e.abilityToMove = false;
e.contorRound = magicNum12;
e.contorMove = magicNum12;
}



}

}
