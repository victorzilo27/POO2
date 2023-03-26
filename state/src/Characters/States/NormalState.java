package Characters.States;

import Characters.Character;
import Characters.State;
import Skills.Attack.Concrete.MidAttack;
import Skills.Run.Concrete.FastRun;

public class NormalState extends State{
    public NormalState(Character character){
        super(character);
        character.setAttack(new MidAttack());
        character.setRun(new FastRun());
    }

    public void verifyStateChange(){
        if(getCharacter().getLife() < getLowerLimit()){
            // check if the character is dead
            if(getCharacter().getLife() == 0){
                getCharacter().setState(new DeadState(getCharacter()));
                return;
            }
            getCharacter().setState(new DangerState(getCharacter()));
        }
        else if(getCharacter().getLife() > getUpperLimit()){
            getCharacter().setState(new StrongState(getCharacter()));
        }
    }

    protected void setLimits(){
        setUpperLimit(70);
        setLowerLimit(30);
    }
}
