package Strategy.Skills.Run.Concrete.Slow;

import Strategy.Skills.Run.Run;

public class SlowRun implements Run {
    @Override
    public void run() {
        System.out.println("Slow Run");
    }
}
