package Composite.Composite;

import Composite.IPhase;
import Strategy.Character.Character;

public class Room implements IPhase {
    private IPhase path1;
    private IPhase path2;
    Character enemy = null;

    public Room(IPhase path1, IPhase path2, Character enemy) {
        this.path1 = path1;
        this.path2 = path2;
        this.enemy = enemy;
        System.out.println("Room created");
    }

    @Override
    public void operation() {
        System.out.println("Room operation");
        path1.operation();
        path2.operation();
    }
}
