package Characters.States;

import Characters.Character;
import Characters.State;
import Skills.Attack.Concrete.LowAttack;
import Skills.Run.Concrete.SlowRun;

public class DangerState extends State{
    public DangerState(Character character){
        super(character);
        character.setAttack(new LowAttack());
        character.setRun(new SlowRun());
    }

    public void verifyStateChange(){
        if(getCharacter().getLife() > getUpperLimit()){
            getCharacter().setState(new NormalState(getCharacter()));
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
