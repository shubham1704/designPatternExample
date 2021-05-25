package creational.factoryDesignPattern.electricityBillCalculator;

public class GetPlanFactory {

  public Plan getPlan(String planType){
     if (planType.equals("Domestic")){
      return new DomesticPlan();
    }

    else if (planType.equals("Commercial")){
      return new CommercialPlan();
    }

    else if (planType.equals("Institutional")){
      return new InstitutionalPlan();
    }
    return null;
  }

}
