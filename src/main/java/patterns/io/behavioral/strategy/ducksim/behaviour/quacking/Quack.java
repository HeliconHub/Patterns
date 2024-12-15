package patterns.io.behavioral.strategy.ducksim.behaviour.quacking;

import patterns.io.behavioral.strategy.ducksim.strategy.QuackBehaviour;

public class Quack implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("Quack Quack !!");
  }
}
