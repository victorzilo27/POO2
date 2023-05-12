package Composite.Leafs;

import Composite.IPhase;

public class Abyss implements IPhase {
    public Abyss() {
        System.out.println("Abyss created");
    }

    @Override
    public void operation() {
        System.out.println("Abyss operation");
    }
}
