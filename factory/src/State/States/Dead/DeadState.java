package State.States.Dead;

import State.State;
import Strategy.Character.Character;

public class DeadState extends State {
    public DeadState(Character character) {
        super(character);
    }

    public void verifyStateChange() {
        getCharacter().setLife(0);
    }

    protected void setLimits() {
        setUpperLimit(0);
        setLowerLimit(0);
    }
}
