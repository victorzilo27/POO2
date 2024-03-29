package Decorator.Attack.Concrete;

import Decorator.Attack.AttackDecorator;
import Strategy.Skills.Attack.Attack;

public class Melee extends AttackDecorator {
    public Melee(Attack decoratedAttack) {
        super(decoratedAttack);
        setDamage(10);
    }

    public String attack() {
        return super.attack() + " with melee" + " (" + getDamage() + ")";
    }
}
