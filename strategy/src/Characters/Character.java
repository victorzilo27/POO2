package Characters;

import Skills.Attack.Attack;
import Skills.Jump.Jump;
import Skills.Run.Run;

public abstract class Character {
    private Attack attack;
    private Jump jump;
    private Run run;

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }

    public void setRun(Run run) {
        this.run = run;
    }

    public void attack() {
        attack.attack();
    }

    public void jump() {
        jump.jump();
    }

    public void run() {
        run.run();
    }
}
