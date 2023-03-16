package Characters.Concrete;

import Characters.Character;
import Skills.Attack.Concrete.StrongAttack;
import Skills.Jump.Concrete.MidJump;
import Skills.Run.Concrete.MidRun;

public class Character01 extends Character{
    public Character01() {
        setAttack(new StrongAttack());
        setJump(new MidJump());
        setRun(new MidRun());
    }
}
