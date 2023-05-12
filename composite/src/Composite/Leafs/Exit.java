package Composite.Leafs;

import Composite.IPhase;

public class Exit implements IPhase {
    public Exit() {
        System.out.println("Exit created");
    }

    @Override
    public void operation() {
        System.out.println("Exit operation");
    }
}
