package creational.factoryDesignPattern.electricityBillCalculator;

public class GenerateElectricityBill {

  public static void main(String[] args) {

    GetPlanFactory planFactory = new GetPlanFactory();
    Plan plan = planFactory.getPlan("Domestic");
    Plan comPlan = planFactory.getPlan("Commercial");
    Plan institutionalPlan = planFactory.getPlan("Institutional");

    if (plan != null){
      System.out.println("*************Domestic Bill*************");
      plan.getRate();
      plan.generateBill(270);
    }

    if (comPlan != null){
      System.out.println("*************Commercial Bill*************");
      comPlan.getRate();
      comPlan.generateBill(3247);
    }

    if (institutionalPlan != null){
      System.out.println("*************Institutional Bill*************");
      institutionalPlan.getRate();
      institutionalPlan.generateBill(34092);
    }

  }

}
