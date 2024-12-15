package patterns.io.behavioral.strategy.ducksim.context;

import patterns.io.behavioral.strategy.ducksim.behaviour.flying.FlyWithWings;
import patterns.io.behavioral.strategy.ducksim.behaviour.quacking.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehaviour = new FlyWithWings();
    quackBehaviour = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am a Mallard Duck");
  }
}
