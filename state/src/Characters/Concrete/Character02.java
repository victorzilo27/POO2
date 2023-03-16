package Characters.Concrete;

import Characters.Character;
import Skills.Attack.Concrete.MidAttack;
import Skills.Jump.Concrete.HighJump;
import Skills.Run.Concrete.FastRun;

public class Character02 extends Character {
    public Character02(){
        setAttack(new MidAttack());
        setJump(new HighJump());
        setRun(new FastRun());
    }
}
