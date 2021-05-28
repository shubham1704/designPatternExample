package structuralDesignPatter.facadaDP;

public class Samsung implements MobileShop {

  @Override
  public void modelNo() {
    System.out.println("Samsung S21 Ultra");
  }

  @Override
  public void price() {
    System.out.println("149000");
  }
}
