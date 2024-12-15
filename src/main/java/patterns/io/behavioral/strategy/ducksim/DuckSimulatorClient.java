package patterns.io.behavioral.strategy.ducksim;

import patterns.io.behavioral.strategy.ducksim.behaviour.flying.FlyWithRocket;
import patterns.io.behavioral.strategy.ducksim.behaviour.flying.FlyWithWings;
import patterns.io.behavioral.strategy.ducksim.behaviour.quacking.Squeak;
import patterns.io.behavioral.strategy.ducksim.context.DecoyDuck;
import patterns.io.behavioral.strategy.ducksim.context.Duck;
import patterns.io.behavioral.strategy.ducksim.context.MallardDuck;
import patterns.io.behavioral.strategy.ducksim.context.RubberDuck;

public class DuckSimulatorClient {

  public static void run() {
    testMallardDuck();
    testRubberDuck();
    testDecoy();
  }

  private static void testMallardDuck() {
    System.out.println();
    System.out.println("...........[Start] Mallard Duck [Start]...........");

    // Set the duck to MallardDuck
    Duck mallardDuck = new MallardDuck();
    mallardDuck.display();
    mallardDuck.performFly();
    mallardDuck.performQuack();

    System.out.println("...........[End] Mallard Duck [End]...........");
    System.out.println();
  }

  private static void testRubberDuck() {
    System.out.println();
    System.out.println("...........[Start] Rubber Duck [Start]...........");

    // Set the duck to RubberDuck
    Duck rubberDuck = new RubberDuck();
    rubberDuck.display();
    rubberDuck.performFly();
    rubberDuck.performQuack();

    // modify the fly behaviour of the rubber duck in runtime
    rubberDuck.setFlyBehaviour(new FlyWithWings());
    rubberDuck.performFly();

    System.out.println("...........[End] Rubber Duck [End]...........");
    System.out.println();
  }

  private static void testDecoy() {
    System.out.println();
    System.out.println("...........[Start] Decoy Duck [Start]...........");

    // Set the duck to DecoyDuck
    Duck decoyDuck = new DecoyDuck();
    decoyDuck.display();
    decoyDuck.performFly();
    decoyDuck.performQuack();

    // modify the quack behaviour of the decoy duck in runtime
    decoyDuck.setFlyBehaviour(new FlyWithRocket());
    decoyDuck.performFly();

    // modify the quack behaviour of the decoy duck in runtime
    decoyDuck.setQuackBehaviour(new Squeak());
    decoyDuck.performQuack();

    System.out.println("...........[End] Decoy Duck [End]...........");
    System.out.println();
  }
}
