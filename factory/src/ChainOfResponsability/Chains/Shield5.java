package ChainOfResponsability.Chains;

import ChainOfResponsability.Shield;
import Strategy.Character.Character;

public class Shield5 extends Shield {
    public void handleSuccessor(Character character, int damage) {
        int damageAfterShield = damage - 5;

        if (damageAfterShield > 0 && getSuccessor() != null) {
            System.out.println("Shield5: Damage reduced by 5");
            getSuccessor().handleSuccessor(character, damageAfterShield);
        } else if (damageAfterShield > 0 && getSuccessor() == null) {
            System.out.println("Shield5: Damage reduced by 5");
            System.out.println("New Damage: " + damageAfterShield);
            character.setLife(character.getLife() - damageAfterShield);
        } else {
            System.out.println("Shield5: Character took 0 damage");
        }
    }
}
