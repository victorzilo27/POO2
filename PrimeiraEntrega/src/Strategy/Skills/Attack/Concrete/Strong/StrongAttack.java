package Strategy.Skills.Attack.Concrete.Strong;
import Strategy.Skills.Attack.Attack;

public class StrongAttack extends Attack {
    public StrongAttack() {
        super(25);
    }

    public String attack() {
        return "Strong attack";
    }
}
