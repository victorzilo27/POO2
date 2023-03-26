package Characters;

public abstract class State {
    private Character character;
    private int upperLimit;
    private int lowerLimit;

    public State(Character character){
        this.character = character;
        setLimits();
    }

    protected abstract void setLimits();
    protected abstract void verifyStateChange();

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

    public void earnLife(int life){
        character.setLife(character.getLife() + life);
        verifyStateChange();
    }

    public void loseLife(int life){
        character.setLife(character.getLife() - life);
        verifyStateChange();
    }
}
