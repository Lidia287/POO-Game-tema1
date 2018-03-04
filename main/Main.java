package main;


import java.io.IOException;


public final class Main {


private Main() {

}
//variables used to read the content of the file
private static int n, m, p, r;
private static String[] terain;
private static String[] personaj;
private static String[] runde;
private  static int[] xV;
private static int[] yV;




public static void read(final String string1, final String string2) {


FileSystem fp;

try {
fp = new FileSystem(string1, string2);
} catch (IOException e) {
throw new RuntimeException(e);
}

try {
n = fp.nextInt();
m = fp.nextInt();
terain = new String[n];

for (int i = 0; i < n; i++) {
terain[i] = fp.nextWord();
}

p = fp.nextInt();
personaj = new String[p];
xV = new int[p];
yV = new int[p];

for (int i = 0; i < p; i++) {
personaj[i] = fp.nextWord();
xV[i] = fp.nextInt();
yV[i] = fp.nextInt();
}

r = fp.nextInt();
runde = new String[r];

for (int i = 0; i < r; i++) {
runde[i] = fp.nextWord();
}

fp.close();
} catch (IOException e) {
throw new RuntimeException(e);
}





}



public static void write(final String string1, final String string2, final Hero[] personaje) {

//output the results in the .out file
try {
//fp.close();
FileSystem fp;

fp = new FileSystem(string1, string2);

for (int o = 0; o < p; o++) {
if (personaje[o].alive) {
fp.writeCharacter(personaje[o].type);
fp.writeCharacter(' ');
fp.writeInt(personaje[o].level);
fp.writeCharacter(' ');
fp.writeInt(personaje[o].xp);
fp.writeCharacter(' ');
fp.writeInt(personaje[o].currentHP);
fp.writeCharacter(' ');
fp.writeInt(personaje[o].x);
fp.writeCharacter(' ');
fp.writeInt(personaje[o].y);

} else if (!personaje[o].alive) {
fp.writeCharacter(personaje[o].type);
fp.writeCharacter(' ');
fp.writeWord("dead");

}

fp.writeNewLine();
}

fp.close();

} catch (IOException e) {
throw new RuntimeException(e);
}



}

public static void main(final String[] args) {
final int magicNum1 = 250;
final int magicNum2 = 50;
final int magicNum3 = 200, magicNum4 = 40;
Hero[] personaje;
read(args[0], args[1]);
personaje = new Hero[p];
for (int i = 0; i < p; i++) { //i create each character in the array of heroes
if (personaj[i].equals("W")) {
Wizard character = new Wizard(xV[i], yV[i]);
personaje[i] = character;
}
if (personaj[i].equals("K")) {
Knight character = new Knight(xV[i], yV[i]);
personaje[i] = character;
}
if (personaj[i].equals("R")) {
Rogue character = new Rogue(xV[i], yV[i]);
personaje[i] = character;
}
if (personaj[i].equals("P")) {
Pyromancer character = new Pyromancer(xV[i], yV[i]);
personaje[i] = character;
}
}
char[] delimiter = new char[p];
char[][] terenuri = new char[n][m];
for (int i = 0; i < n; i++) {
for (int j = 0; j < m; j++) {
terenuri[i][j] = terain[i].charAt(j);
}
}
for (int i = 0; i < r; i++) { //iteration through rounds to start the battles
for (int j = 0; j < p; j++) {
delimiter[j] = runde[i].charAt(j);
if (personaje[j].abilityToMove && personaje[j].alive) {
if (delimiter[j] == 'U') {
personaje[j].setX(personaje[j].getX() - 1);
}
if (delimiter[j] == 'D') {
personaje[j].setX(personaje[j].getX() + 1);
}
if (delimiter[j] == 'L') {
personaje[j].setY(personaje[j].getY() - 1);
}
if (delimiter[j] == 'R') {
personaje[j].setY(personaje[j].getY() + 1);
}
}
if (personaje[j].contorMove == 1) { //i check if the character can move
personaje[j].abilityToMove = true;
personaje[j].contorMove = 0;
} else if (personaje[j].contorMove > 1) {
personaje[j].abilityToMove = false;
personaje[j].contorMove = personaje[j].contorMove - 1;
}
if (personaje[j].contorRound == 1) { //check the round given damage duration
personaje[j].contorRound = 0;
personaje[j].currentHP = personaje[j].currentHP - personaje[j].damagePerRound;
personaje[j].damagePerRound = 0;
} else if (personaje[j].contorRound > 1) {
personaje[j].contorRound =  personaje[j].contorRound - 1;
personaje[j].currentHP = personaje[j].currentHP - personaje[j].damagePerRound;
}
}
for (int k = 0; k < n; k++) {
for (int l = 0; l < m; l++) {
int p1 = -1; int p2 = -1;
for (int o = 0; o < p; o++) { //i find the 2 characters on the land marked by k and l
if (personaje[o].getX() == k && personaje[o].getY() == l && personaje[o].alive) {
if (p1 == -1) {
p1 = o;
} else if (p1 != -1 && p2 == -1) {
p2 = o;
}
}
}
if (p1 != -1 && p2 != -1) { //if there are 2 characters that can fight
personaje[p1].currentLand = terenuri[k][l];
personaje[p2].currentLand = terenuri[k][l];
if (personaje[p2].alive && personaje[p1].alive) {
if (personaje[p1].currentHP <= 0) {
personaje[p1].alive = false;
}
if (personaje[p2].currentHP <= 0) {
personaje[p2].alive = false;
}
if (personaje[p2].alive && personaje[p1].alive) {
if (personaje[p1] instanceof Wizard) { //the wizard needs to be the second to attack
personaje[p1].accept(personaje[p2].abilities);
personaje[p2].damageWizard = personaje[p1].damageWizard;
personaje[p2].accept(personaje[p1].abilities);
} else {
personaje[p2].accept(personaje[p1].abilities);
personaje[p1].damageWizard = personaje[p2].damageWizard;
personaje[p1].accept(personaje[p2].abilities);
}
personaje[p1].currentHP = personaje[p1].currentHP - personaje[p1].totalDamage;
personaje[p2].currentHP = personaje[p2].currentHP - personaje[p2].totalDamage;
if (personaje[p1].currentHP <= 0) {
personaje[p1].alive = false;
}
if (personaje[p2].currentHP <= 0) {
personaje[p2].alive = false;
}
if (personaje[p1].alive && !personaje[p2].alive) { //check if one is dead
int max = 0;
if (magicNum3 - (personaje[p1].level - personaje[p2].level) * magicNum4 > 0) {
max = magicNum3 - (personaje[p1].level - personaje[p2].level) * magicNum4;
}
personaje[p1].xp = personaje[p1].xp + max;
int ok = 0; //XP_level_up = 250 + nivel_curent * 50
while (ok == 0) {
int xpLevelUp = magicNum1 + personaje[p1].level * magicNum2;
if (personaje[p1].xp >= xpLevelUp) {
personaje[p1].change();
} else if (personaje[p1].xp < xpLevelUp) {
ok = 1;
}
}
}
if (personaje[p2].alive && !personaje[p1].alive) {
int max = 0;
if (magicNum3 - (personaje[p2].level - personaje[p1].level) * magicNum4 > 0) {
max = magicNum3 - (personaje[p2].level - personaje[p1].level) * magicNum4;
}
personaje[p2].xp = personaje[p2].xp + max;
int ok = 0; //XP_level_up = 250 + nivel_curent * 50
while (ok == 0) {
int xpLevelUp = magicNum1 + personaje[p2].level * magicNum2;
if (personaje[p2].xp >= xpLevelUp) {
personaje[p2].change();
} else if (personaje[p2].xp < xpLevelUp) {
ok = 1;
}
}
}
}
}
}
}
}
}
for (int o = 0; o < p; o++) {
if (personaje[o].currentHP <= 0) {
personaje[o].alive = false;
}
}
write(args[0], args[1], personaje);
}

}
