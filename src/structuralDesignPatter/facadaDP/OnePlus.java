package structuralDesignPatter.facadaDP;

public class OnePlus implements MobileShop {

  @Override
  public void modelNo() {
    System.out.println("OnePlus 9 Pro");
  }

  @Override
  public void price() {
    System.out.println("69000");
  }
}
