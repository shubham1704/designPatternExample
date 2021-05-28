package structuralDesignPatter.compositeDP;

public class CompositMainExample {

  public static void main(String[] args) {

    Component mouse = new Leaf(500, "Mouse");
    Component keyboard = new Leaf(700, "KeyBoard");
    Component hDD = new Leaf(4000, "HDD");
    Component ram = new Leaf(2000, "RAM");
    Component cpu = new Leaf(9000, "CPU");

    Composite motherBoard = new Composite("MotherBoard");
    motherBoard.addComponent(ram);
    motherBoard.addComponent(cpu);

    Composite peripheral = new Composite("Peripheral");
    peripheral.addComponent(keyboard);
    peripheral.addComponent(mouse);

    Composite cabinat = new Composite("Cabinet");
    cabinat.addComponent(hDD);
    cabinat.addComponent(motherBoard);


    Composite computer = new Composite("Computer");
    computer.addComponent(cabinat);
    computer.addComponent(peripheral);

    computer.showPrice();

  }

}
