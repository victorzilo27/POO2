package Skills.Attack.Concrete;
import Skills.Attack.Attack;

public class WeakAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("Low Attack");
    }
}
