package Decorator.Attack.Concrete;

import Decorator.Attack.AttackDecorator;

public class Ranged extends AttackDecorator {
    public Ranged(AttackDecorator decoratedAttack) {
        super(decoratedAttack);
    }

    @Override
    public void attack() {
        System.out.println("Ranged attack!");
    }
}
