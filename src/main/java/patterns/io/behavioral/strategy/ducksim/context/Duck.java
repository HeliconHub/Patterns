package patterns.io.behavioral.strategy.ducksim.context;

import patterns.io.behavioral.strategy.ducksim.strategy.FlyBehaviour;
import patterns.io.behavioral.strategy.ducksim.strategy.QuackBehaviour;

public abstract class Duck {
  FlyBehaviour flyBehaviour;
  QuackBehaviour quackBehaviour;

  protected Duck() {}

  public void setFlyBehaviour(final FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  public void setQuackBehaviour(final QuackBehaviour quackBehaviour) {
    this.quackBehaviour = quackBehaviour;
  }

  public void performFly() {
    flyBehaviour.fly();
  }

  public void performQuack() {
    quackBehaviour.quack();
  }

  public abstract void display();

  public void swim() {
    System.out.println("I can swim");
  }
}
