package Strategy.Skills.Attack.Concrete.Strong;
import Strategy.Skills.Attack.Attack;

public class StrongAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("High Attack");
    }
}
