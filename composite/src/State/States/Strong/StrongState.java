package State.States.Strong;

import State.State;
import State.States.Normal.NormalState;
import Strategy.Character.Character;
import Strategy.Skills.Attack.Concrete.Strong.StrongAttack;
import Strategy.Skills.Run.Concrete.Fast.FastRun;

public class StrongState extends State{
    public StrongState(Character character){
        super(character);
        character.setAttack(new StrongAttack());
        character.setRun(new FastRun());
    }

    public void verifyStateChange(){
        if(getCharacter().getLife() < getLowerLimit()){
            getCharacter().setState(new NormalState(getCharacter()));
            getCharacter().getState().verifyStateChange();
        } else if(getCharacter().getLife() > getUpperLimit()){
            getCharacter().setLife(this.getUpperLimit()); // limit the life
        }
    }

    protected void setLimits(){
        setUpperLimit(100);
        setLowerLimit(70);
    }
}
