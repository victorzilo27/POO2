package Strategy.Character;

import ChainOfResponsability.Shield;
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
    private Shield shield;
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

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public void earnLife(int life){
        this.getState().earnLife(life);
        System.out.println("Earned Life: " + life);
        System.out.println("Life: " + this.getLife());
        System.out.println("State: " + this.getState().toString());
    }

    public void loseLife(int damage){
        this.getState().loseLife(damage);
        System.out.println("Damage: " + damage);
        System.out.println("Life: " + this.getLife());
        System.out.println("State: " + this.getState().toString());
    }
}
