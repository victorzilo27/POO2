package Strategy.Character;

import State.State;
import State.States.Normal.NormalState;
import Strategy.Skills.Attack.Attack;
import Strategy.Skills.Jump.Jump;
import Strategy.Skills.Run.Run;

public abstract class Character {
    private State state;
    private Attack attack;
    private Jump jump;
    private Run run;
    private int life;

    public Character(){
        this.state = new NormalState(this);
        this.life = 70;
    }

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

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void earnLife(int life){
        this.getState().earnLife(life);
        this.getState().verifyStateChange();
        System.out.println("Life: " + this.getLife());
    }

    public void loseLife(int life){
        this.getState().loseLife(life);
        this.getState().verifyStateChange();
        System.out.println("Life: " + this.getLife());
    }
}
