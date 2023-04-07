package Strategy.Skills.Attack.Concrete.Low;
import Strategy.Skills.Attack.Attack;

public class LowAttack extends Attack {
    public LowAttack() {
        super(5);
    }

    public String attack() {
        return "Low attack";
    }
}
