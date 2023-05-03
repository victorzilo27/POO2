package Strategy.Character.Concrete;

import Strategy.Character.Character;
import Strategy.Skills.Attack.Concrete.Strong.StrongAttack;
import Strategy.Skills.Jump.Concrete.Low.LowJump;
import Strategy.Skills.Run.Concrete.Fast.FastRun;

public class Character03 extends Character {
    public Character03(){
        setAttack(new StrongAttack());
        setJump(new LowJump());
        setRun(new FastRun());
    }
}
