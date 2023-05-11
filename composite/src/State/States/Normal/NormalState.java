package State.States.Normal;

import State.State;
import State.States.Danger.DangerState;
import State.States.Strong.StrongState;
import Strategy.Character.Character;
import Strategy.Skills.Attack.Concrete.Mid.MidAttack;
import Strategy.Skills.Run.Concrete.Fast.FastRun;

public class NormalState extends State{
    public NormalState(Character character){
        super(character);
        character.setAttack(new MidAttack());
        character.setRun(new FastRun());
    }

    public void verifyStateChange(){
        if(getCharacter().getLife() < getLowerLimit()){
            getCharacter().setState(new DangerState(getCharacter()));
            getCharacter().getState().verifyStateChange();
        }
        else if(getCharacter().getLife() > getUpperLimit()){
            getCharacter().setState(new StrongState(getCharacter()));
            getCharacter().getState().verifyStateChange();
        }
    }

    protected void setLimits(){
        setUpperLimit(70);
        setLowerLimit(30);
    }
}
