package creational.abstractFactoryPattern.factory;

import creational.abstractFactoryPattern.bank.Bank;
import creational.abstractFactoryPattern.loan.BusinessLoan;
import creational.abstractFactoryPattern.loan.EducationLoan;
import creational.abstractFactoryPattern.loan.HomeLoan;
import creational.abstractFactoryPattern.loan.Loan;

public class LoanFactory extends AbstractFactory {

  public Bank getBank(String bank){
    return null;
  }

  public Loan getLoan(String loan){
    if(loan == null){
      return null;
    }
    if(loan.equalsIgnoreCase("Home")){
      return new HomeLoan();
    } else if(loan.equalsIgnoreCase("Business")){
      return new BusinessLoan();
    } else if(loan.equalsIgnoreCase("Education")){
      return new EducationLoan();
    }
    return null;
  }

}
