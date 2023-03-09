package Characters.Concrete;

import Characters.Character;
import Skills.Attack.Concrete.HighAttack;
import Skills.Jump.Concrete.MidJump;
import Skills.Run.Concrete.FastRun;

public class Character01 extends Character{
    public Character01() {
        setAttack(new HighAttack());
        setJump(new MidJump());
        setRun(new FastRun());
    }
}
