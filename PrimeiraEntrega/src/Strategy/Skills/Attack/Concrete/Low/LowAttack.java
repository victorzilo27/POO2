package Strategy.Skills.Attack.Concrete.Low;
import Strategy.Skills.Attack.Attack;

public class LowAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("Low Attack");
    }
}
