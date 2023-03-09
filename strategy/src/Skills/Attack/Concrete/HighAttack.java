package Skills.Attack.Concrete;
import Skills.Attack.Attack;

public class HighAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("High Attack");
    }
}
