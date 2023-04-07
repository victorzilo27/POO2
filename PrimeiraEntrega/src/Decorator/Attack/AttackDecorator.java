package Decorator.Attack;

import Strategy.Skills.Attack.Attack;

public interface AttackDecorator extends Attack {
    private Attack decoratedAttack;

    public AttackDecorator(Attack decoratedAttack) {
        this.decoratedAttack = decoratedAttack;
    }
}
