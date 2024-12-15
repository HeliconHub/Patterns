package patterns.io.behavioral.strategy.ducksim.behaviour.quacking;

import patterns.io.behavioral.strategy.ducksim.strategy.QuackBehaviour;

public class Squeak implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
