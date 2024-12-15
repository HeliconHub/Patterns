package patterns.io.behavioral.strategy.ducksim.context;

import patterns.io.behavioral.strategy.ducksim.behaviour.flying.FlyNoWay;
import patterns.io.behavioral.strategy.ducksim.behaviour.quacking.Squeak;

public class RubberDuck extends Duck {

  public RubberDuck() {
    flyBehaviour = new FlyNoWay();
    quackBehaviour = new Squeak();
  }

  @Override
  public void display() {
    System.out.println("I am a Rubber Duck");
  }
}
