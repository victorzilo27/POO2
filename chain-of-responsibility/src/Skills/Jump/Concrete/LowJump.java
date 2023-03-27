package Skills.Jump.Concrete;

import Skills.Jump.Jump;

public class LowJump implements Jump {
    @Override
    public void jump() {
        System.out.println("Low Jump");
    }
}
