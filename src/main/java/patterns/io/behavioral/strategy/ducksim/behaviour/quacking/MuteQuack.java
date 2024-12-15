package patterns.io.behavioral.strategy.ducksim.behaviour.quacking;

import patterns.io.behavioral.strategy.ducksim.strategy.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
