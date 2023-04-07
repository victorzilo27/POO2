package Strategy.Character.Concrete;

import Strategy.Character.Character;
import Strategy.Skills.Attack.Concrete.Mid.MidAttack;
import Strategy.Skills.Jump.Concrete.High.HighJump;
import Strategy.Skills.Run.Concrete.Fast.FastRun;

public class Character02 extends Character {
    public Character02(){
        setAttack(new MidAttack());
        setJump(new HighJump());
        setRun(new FastRun());
    }
}
