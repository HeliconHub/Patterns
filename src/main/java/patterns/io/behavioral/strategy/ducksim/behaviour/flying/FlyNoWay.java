package patterns.io.behavioral.strategy.ducksim.behaviour.flying;

import patterns.io.behavioral.strategy.ducksim.strategy.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("I can't fly");
  }
}
