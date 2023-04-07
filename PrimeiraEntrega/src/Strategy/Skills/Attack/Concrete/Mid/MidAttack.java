package Strategy.Skills.Attack.Concrete.Mid;
import Strategy.Skills.Attack.Attack;

public class MidAttack extends Attack {
    public MidAttack() {
        super(10);
    }
    
    public String attack() {
        return "Mid attack" + " (" + getDamage() + ")";
    }
}
