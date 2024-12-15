package patterns.io.behavioral.strategy.ducksim.behaviour.flying;

import patterns.io.behavioral.strategy.ducksim.strategy.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("I'm flying with a rocket");
  }
}
