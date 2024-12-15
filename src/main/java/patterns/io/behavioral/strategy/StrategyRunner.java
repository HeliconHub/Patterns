package patterns.io.behavioral.strategy;

import patterns.io.behavioral.strategy.ducksim.DuckSimulatorClient;

public class StrategyRunner {

  private StrategyRunner() {}

  public static void run() {
    System.out.println("...........Running Strategy Pattern...........");
    DuckSimulatorClient.run();
    System.out.println("...........Strategy Pattern Finished...........");
  }
}
