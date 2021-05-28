package structuralDesignPatter.facadaDP;

public class ShopKeeper {

  MobileShop iPhone;
  MobileShop samsung;
  MobileShop onePlus;

  public ShopKeeper() {
    iPhone = new IPhone();
    samsung = new Samsung();
    onePlus = new OnePlus();
  }

  public void saleIPhone(){
    iPhone.modelNo();
    iPhone.price();
  }

  public void saleSamsung(){
    samsung.modelNo();
    samsung.price();
  }

  public void saleOnePlus(){
    onePlus.modelNo();
    onePlus.price();
  }
}
