package State.States.Danger;

import State.State;
import State.States.Dead.DeadState;
import State.States.Normal.NormalState;
import Strategy.Character.Character;
import Strategy.Skills.Attack.Concrete.Low.LowAttack;
import Strategy.Skills.Run.Concrete.Slow.SlowRun;

public class DangerState extends State{
    public DangerState(Character character){
        super(character);
        character.setAttack(new LowAttack());
        character.setRun(new SlowRun());
    }

    public void verifyStateChange(){
        if(getCharacter().getLife() > getUpperLimit()){
            getCharacter().setState(new NormalState(getCharacter()));
            getCharacter().getState().verifyStateChange();
        }
        else if(getCharacter().getLife() < getLowerLimit()){
            getCharacter().setState(new DeadState(getCharacter()));
        }
    }

    protected void setLimits(){
        setUpperLimit(30);
        setLowerLimit(0);
    }
}
