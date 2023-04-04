package Strategy.Skills.Attack.Concrete.Mid;
import Strategy.Skills.Attack.Attack;

public class MidAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("Mid Attack");
    }
}
