package creational.factoryDesignPattern.electricityBillCalculator;

public abstract class Plan {

  protected double rate;

  public abstract void getRate();

  public void generateBill(int units){
    System.out.println("Your Electricity Bill is --> "+rate*units);
  }

}
