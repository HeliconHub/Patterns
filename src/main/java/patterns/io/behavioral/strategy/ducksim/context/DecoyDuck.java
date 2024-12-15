package patterns.io.behavioral.strategy.ducksim.context;

import patterns.io.behavioral.strategy.ducksim.behaviour.flying.FlyNoWay;
import patterns.io.behavioral.strategy.ducksim.behaviour.quacking.MuteQuack;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    flyBehaviour = new FlyNoWay();
    quackBehaviour = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("I am a Decoy Duck");
  }
}
