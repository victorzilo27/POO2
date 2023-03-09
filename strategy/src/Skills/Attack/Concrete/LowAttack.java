package Skills.Attack.Concrete;
import Skills.Attack.Attack;

public class LowAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("Low Attack");
    }
}
