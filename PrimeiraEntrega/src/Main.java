import ChainOfResponsability.Shield;
import ChainOfResponsability.Chains.Shield10;
import ChainOfResponsability.Chains.Shield5;
import Decorator.Attack.Concrete.Melee;
import Decorator.Attack.Concrete.Ranged;
import Decorator.Attack.Concrete.Special;
import Strategy.Character.Character;
import Strategy.Character.Concrete.Character01;

class Main {
    public static void main(String[] args) {
        Character c;

        System.out.println("--- Game Started ---");

        System.out.println("Character 01");
        c = new Character01();
        System.out.println("Attack: " + c.getAttack().attack());
        System.out.println("Jump: " + c.getJump().jump());
        System.out.println("Run: " + c.getRun().run());

        // Linking the chain of responsibility of shields
        Shield s1 = new Shield5();
        Shield s2 = new Shield10();

        s1.setSuccessor(s2);
        s2.setSuccessor(null);

        c.setShield(s1);

        // Create decorator
        c.setAttack(new Melee(c.getAttack()));
        c.setAttack(new Ranged(c.getAttack()));
        c.setAttack(new Special(c.getAttack()));

        System.out.println();
        System.out.println("Attack: " + c.getAttack().attack());
        System.out.println("Damage: " + c.getAttack().getDamage());

        // State: Normal
        System.out.println();
        System.out.println("Initial State: " + c.getState().toString());
        System.out.println("Life: " + c.getLife());
        System.out.println();

        // State: Strong
        c.earnLife(40);

        System.out.println();

        // State: Danger
        c.loseLife(85);

        System.out.println();

        // State: Dead
        c.loseLife(100);

        System.out.println("--- Game Ended ---");
    }
}