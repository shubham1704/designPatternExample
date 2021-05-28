package structuralDesignPatter.facadaDP;

public class FacadePatternClient {

  public static void main(String[] args) {

    ShopKeeper keeper = new ShopKeeper();

    keeper.saleIPhone();
    keeper.saleSamsung();
    keeper.saleOnePlus();

  }
}
