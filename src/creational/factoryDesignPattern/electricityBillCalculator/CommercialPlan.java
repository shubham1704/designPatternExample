package creational.factoryDesignPattern.electricityBillCalculator;

public class CommercialPlan extends Plan {

  @Override
  public void getRate() {
    rate = 4.25;
  }

}
