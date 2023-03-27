package Characters.Concrete;

import Characters.Character;
import Skills.Attack.Concrete.StrongAttack;
import Skills.Jump.Concrete.LowJump;
import Skills.Run.Concrete.FastRun;

public class Character03 extends Character {
    public Character03(){
        setAttack(new StrongAttack());
        setJump(new LowJump());
        setRun(new FastRun());
    }
}
