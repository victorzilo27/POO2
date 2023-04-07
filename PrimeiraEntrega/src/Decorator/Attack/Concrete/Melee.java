package Decorator.Attack.Concrete;

import Decorator.Attack.AttackDecorator;

public class Melee extends AttackDecorator {
    public Melee(AttackDecorator decoratedAttack) {
        super(decoratedAttack);
    }

    @Override
    public void attack() {
        System.out.println("Melee attack!");
    }
}
