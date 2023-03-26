package Characters.States;

import Characters.Character;
import Characters.State;

public class DeadState extends State {
    public DeadState(Character character) {
        super(character);
    }

    public void verifyStateChange() {
        System.out.println("You are dead!");
    }

    protected void setLimits() {
        setUpperLimit(0);
        setLowerLimit(0);
    }
}
