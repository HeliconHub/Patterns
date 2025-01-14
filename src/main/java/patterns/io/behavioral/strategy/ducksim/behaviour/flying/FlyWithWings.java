package patterns.io.behavioral.strategy.ducksim.behaviour.flying;

import patterns.io.behavioral.strategy.ducksim.strategy.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
