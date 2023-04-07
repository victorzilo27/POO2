package ChainOfResponsability.Chains;

import ChainOfResponsability.Shield;
import Strategy.Character.Character;

public class Shield5 extends Shield {
    public void handleSuccessor(Character character, int damage) {
        int damageAfterShield = damage - 5;

        if (damageAfterShield > 0 && getSuccessor() != null) {
            System.out.println("Shield5: Character took " + damageAfterShield + " damage");
            getSuccessor().handleSuccessor(character, damageAfterShield);
        } else {
            System.out.println("Shield5: Character took 0 damage");
        }
    }
}
