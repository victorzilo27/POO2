package Characters;

public abstract class Shield {
    
private Shield sucessor;
private Character character;

public Shield(Character character){
    this.character = character;
}

public Character getCharacter (Character character){
    return this.character;
}

public void setCharacter(Character character) {
    this.character = character;
}

public Character getCharacter() {
    return character;
}

public void setSucessor (Shield sucessor){
    this.sucessor = sucessor;
}

public void loseLife(int life){
    character.loseLife(life);
}

public Shield getSucessor(){
    return this.sucessor;

}

public abstract void processaShield (int valor);

}
