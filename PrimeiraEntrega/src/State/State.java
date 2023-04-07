package State;

import Strategy.Character.Character;

public abstract class State {
    private Character character;
    private int upperLimit;
    private int lowerLimit;

    public State(Character character){
        this.character = character;
        setLimits();
    }

    protected abstract void setLimits();
    public abstract void verifyStateChange();

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    @Override
    public String toString() {
        String currentState = this.getClass().getSimpleName().replace("State", "");
        return currentState;
    }

    public void earnLife(int life){
        character.setLife(character.getLife() + life);
        verifyStateChange();
    }

    public void loseLife(int life){
        if(this.getCharacter().getShield() != null)
            this.getCharacter().getShield().handleSuccessor(this.getCharacter(), life);
        else
            character.setLife(character.getLife() - life);
        verifyStateChange();
    }
}
