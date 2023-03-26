package Characters.States;

import Characters.Character;
import Characters.State;
import Skills.Attack.Concrete.StrongAttack;
import Skills.Run.Concrete.FastRun;

public class StrongState extends State{
    public StrongState(Character character){
        super(character);
        character.setAttack(new StrongAttack());
        character.setRun(new FastRun());
    }

    public void verifyStateChange(){
        if(getCharacter().getLife() < getLowerLimit()){
            getCharacter().setState(new NormalState(getCharacter()));
        } else if(getCharacter().getLife() > getUpperLimit()){
            getCharacter().setLife(getUpperLimit()); // limit the life
        }
    }

    protected void setLimits(){
        setUpperLimit(100);
        setLowerLimit(70);
    }
}
