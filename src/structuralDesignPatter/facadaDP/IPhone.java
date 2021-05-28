package structuralDesignPatter.facadaDP;

public class IPhone implements MobileShop {

  @Override
  public void modelNo() {
    System.out.println("IPhone 12");
  }

  @Override
  public void price() {
    System.out.println("120000");
  }
}
