package Skills.Attack.Concrete;
import Skills.Attack.Attack;

public class MidAttack implements Attack {
    @Override
    public void attack() {
        System.out.println("Mid Attack");
    }
}
