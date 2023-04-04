package State.States.Dead;

import State.State;
import Strategy.Character.Character;

public class DeadState extends State {
    public DeadState(Character character) {
        super(character);
    }

    public void verifyStateChange() {
        getCharacter().setLife(getLowerLimit());
        System.out.println("You are dead!");
    }

    protected void setLimits() {
        setUpperLimit(0);
        setLowerLimit(0);
    }
}
