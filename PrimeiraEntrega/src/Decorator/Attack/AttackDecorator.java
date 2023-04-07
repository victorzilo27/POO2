package Decorator.Attack;

import Strategy.Skills.Attack.Attack;

public abstract class AttackDecorator extends Attack {
    private Attack decoratedAttack;

    public AttackDecorator(Attack decoratedAttack) {
        this.decoratedAttack = decoratedAttack;
    }

    public int getDamage() {
        return decoratedAttack.getDamage() + super.getDamage();
    }

    public String attack() {
        return decoratedAttack.attack();
    }
}
