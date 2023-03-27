package Skills.Attack.Concrete;
import Skills.Attack.Attack;

public class StrongAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("High Attack");
    }
}
