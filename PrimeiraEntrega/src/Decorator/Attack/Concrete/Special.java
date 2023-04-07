package Decorator.Attack.Concrete;

import Decorator.Attack.AttackDecorator;
import Strategy.Skills.Attack.Attack;

public class Special extends AttackDecorator {
    public Special(Attack decoratedAttack) {
        super(decoratedAttack);
        setDamage(25);
    }

    public String attack() {
        return super.attack() + " with special" + " (" + getDamage() + ")";
    }
}
