package Strategy.Skills.Jump.Concrete.Low;

import Strategy.Skills.Jump.Jump;

public class LowJump implements Jump {
    @Override
    public void jump() {
        System.out.println("Low Jump");
    }
}
