package main;



public class AbilitiesPyromancer extends Abilities {

public AbilitiesPyromancer() {


final int magicNum1 = 350;
final int magicNum2 = 50;
final int magicNum3 = 150;
final int magicNum4 = 20;
final int magicNum5 = 50;
final int magicNum6 = 30;



fireblastDamage = magicNum1;
fireblastDamagePerLevel = magicNum2;



igniteDamage = magicNum3;
igniteDamagePerLevel = magicNum4;
igniteDamageRound = magicNum5;
igniteDamageRoundPerLevel = magicNum6;

}

@Override
final void interactWith(final Hero e) {


}

@Override
final void interactWith(final Rogue e) {


float fireblast = fireblastDamage;
float ignite = igniteDamage;
float igniteRound = igniteDamageRound;


if (e.currentLand == 'V') {

final float magicNum7 = 1.25f;
float landMod = magicNum7;
fireblast =  fireblast * landMod;
ignite = ignite * landMod;
igniteRound = igniteRound * landMod;
}

final float magicNum8 = 0.8f;
final float magicNum9 = 0.8f;

float raceMod1 = magicNum8;
float raceMod2 = magicNum9;

fireblast =  fireblast * raceMod1; //race modifiers
ignite =  ignite * raceMod2;
igniteRound =  igniteRound * raceMod2;

float sum = fireblast + ignite;
float partialSum = igniteRound;

int s = Math.round(sum);
int pS = Math.round(partialSum);


e.totalDamage = s;
e.damagePerRound = pS;
e.contorRound = 2;
e.abilityToMove = true;
e.contorMove = 0;


}
@Override
final void interactWith(final Wizard e) {

float fireblast = fireblastDamage;
float ignite = igniteDamage;
float igniteRound = igniteDamageRound;


if (e.currentLand == 'V') {
final float magicNum7 = 1.25f;
float landMod = magicNum7;
fireblast =  fireblast * landMod;
ignite = ignite * landMod;
igniteRound = igniteRound * landMod;
}

float dmgWizard = fireblast + ignite;
int dmgWizardInt = Math.round(dmgWizard);
e.damageWizard = dmgWizardInt;

final float magicNum8 = 1.05f;
final float magicNum9 = 1.05f;

float raceMod1 = magicNum8;
float raceMod2 = magicNum9;

fireblast =  fireblast * raceMod1; //race modifiers
ignite =  ignite * raceMod2;
igniteRound =  igniteRound * raceMod2;

float sum = fireblast + ignite;
float partialSum = igniteRound;

int s = Math.round(sum);
int pS = Math.round(partialSum);


e.totalDamage = s;
e.damagePerRound = pS;
e.contorRound = 2;
e.abilityToMove = true;
e.contorMove = 0;



}

@Override
final void interactWith(final Knight e) {

float fireblast = fireblastDamage;
float ignite = igniteDamage;
float igniteRound = igniteDamageRound;


if (e.currentLand == 'V') {
final float magicNum7 = 1.25f;
float landMod = magicNum7;
fireblast =  fireblast * landMod;
ignite = ignite * landMod;
igniteRound = igniteRound * landMod;
}

final float magicNum8 = 1.2f;
final float magicNum9 = 1.2f;
float raceMod1 = magicNum8;
float raceMod2 = magicNum9;

fireblast =  fireblast * raceMod1; //race modifiers
ignite =  ignite * raceMod2;
igniteRound =  igniteRound * raceMod2;

float sum = fireblast + ignite;
float partialSum = igniteRound;

int s = Math.round(sum);
int pS = Math.round(partialSum);


e.totalDamage = s;
e.damagePerRound = pS;
e.contorRound = 2;
e.abilityToMove = true;
e.contorMove = 0;




}

@Override
final void interactWith(final Pyromancer e) {

float fireblast = fireblastDamage;
float ignite = igniteDamage;
float igniteRound = igniteDamageRound;


if (e.currentLand == 'V') {

final float magicNum7 = 1.25f;
float landMod = magicNum7;
fireblast =  fireblast * landMod;
ignite = ignite * landMod;
igniteRound = igniteRound * landMod;
}


final float magicNum8 = 0.9f;
final float magicNum9 = 0.9f;

float raceMod1 = magicNum8;
float raceMod2 = magicNum9;

fireblast =  fireblast * raceMod1; //race modifiers
ignite =  ignite * raceMod2;
igniteRound =  igniteRound * raceMod2;

float sum = fireblast + ignite;
float partialSum = igniteRound;

int s = Math.round(sum);
int pS = Math.round(partialSum);


e.totalDamage = s;
e.damagePerRound = pS;
e.contorRound = 2;
e.abilityToMove = true;
e.contorMove = 0;




}


}
