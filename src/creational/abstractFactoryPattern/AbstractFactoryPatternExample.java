package creational.abstractFactoryPattern;

import creational.abstractFactoryPattern.bank.Bank;
import creational.abstractFactoryPattern.factory.AbstractFactory;
import creational.abstractFactoryPattern.factory.FactoryCreator;
import creational.abstractFactoryPattern.loan.Loan;

public class AbstractFactoryPatternExample {

  public static void main(String[] args) {

    AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
    Bank b=bankFactory.getBank("SBI");

    AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
    Loan l=loanFactory.getLoan("Home");

    if (l != null){
      l.getInterestRate(7);
      l.calculateLoanPayment(2500000,30);
    }


  }

}
