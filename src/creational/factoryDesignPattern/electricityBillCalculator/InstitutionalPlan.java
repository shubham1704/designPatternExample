package creational.factoryDesignPattern.electricityBillCalculator;

public class InstitutionalPlan extends Plan {

  @Override
  public void getRate() {
    rate = 7.25;
  }
}
