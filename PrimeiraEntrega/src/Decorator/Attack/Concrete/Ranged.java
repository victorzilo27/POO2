package Decorator.Attack.Concrete;

import Decorator.Attack.AttackDecorator;
import Strategy.Skills.Attack.Attack;

public class Ranged extends AttackDecorator {
    public Ranged(Attack decoratedAttack) {
        super(decoratedAttack);
        setDamage(5);
    }

    public String attack() {
        return super.attack() + " with ranged" + " (" + getDamage() + ")";
    }
}
