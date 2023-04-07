package Decorator.Attack.Concrete;

import Decorator.Attack.AttackDecorator;

public class Special extends AttackDecorator {
    public Special(AttackDecorator decoratedAttack) {
        super(decoratedAttack);
    }

    @Override
    public void attack() {
        System.out.println("Special attack!");
    }
}
