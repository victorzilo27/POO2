package Strategy.Character.Concrete;

import Strategy.Character.Character;
import Strategy.Skills.Attack.Concrete.Strong.StrongAttack;
import Strategy.Skills.Jump.Concrete.Mid.MidJump;
import Strategy.Skills.Run.Concrete.Mid.MidRun;

public class Character01 extends Character{
    public Character01() {
        setAttack(new StrongAttack());
        setJump(new MidJump());
        setRun(new MidRun());
    }
}
