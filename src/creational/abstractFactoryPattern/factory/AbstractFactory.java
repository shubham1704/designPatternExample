package creational.abstractFactoryPattern.factory;

import creational.abstractFactoryPattern.bank.Bank;
import creational.abstractFactoryPattern.loan.Loan;

public abstract class AbstractFactory {

  public abstract Bank getBank(String bank);

  public abstract Loan getLoan(String loan);
}
