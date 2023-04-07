import ChainOfResponsability.Shield;
import ChainOfResponsability.Chains.Shield10;
import ChainOfResponsability.Chains.Shield5;
import Decorator.Attack.Concrete.Melee;
import Decorator.Attack.Concrete.Ranged;
import Decorator.Attack.Concrete.Special;
import Strategy.Character.Character;
import Strategy.Character.Concrete.Character01;
import Strategy.Skills.Attack.Attack;
import Strategy.Skills.Attack.Concrete.Strong.StrongAttack;

class Main {
    public static void main(String[] args) {
        Character c;

        System.out.println("--- Game Started ---");

        System.out.println("Character 01");
        c = new Character01();
        c.attack();
        c.jump();
        c.run();

        // Linking the chain of responsibility of shields
        Shield s1 = new Shield5();
        Shield s2 = new Shield10();

        s1.setSuccessor(s2);
        s2.setSuccessor(null);

        c.setShield(s1);

        // Create decorator
        Attack a = new StrongAttack();
        a = new Melee(a);
        a = new Ranged(a);
        a = new Special(a);

        System.out.println("Attack: " + a.attack());
        System.out.println("Damage: " + a.getDamage());


        // State: Normal
        System.out.println();
        System.out.println("Initial State: " + c.getState().toString());
        System.out.println();

        // State: Strong
        c.earnLife(40);
        System.out.println("State after earning 40: " + c.getState().toString());
        System.out.println();

        // State: Danger
        c.loseLife(85);
        System.out.println("State after losing 85: " + c.getState().toString());
        System.out.println();

        // State: Dead
        c.loseLife(100);
        System.out.println("State after losing 100: " + c.getState().toString());

        System.out.println("--- Game Ended ---");
    }
}