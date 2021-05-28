package structuralDesignPatter.adapterDesignPattern;

public class School {

  public static void main(String[] args) {

    Pen p = new PenAdapter();

    AssignmentWork aw = new AssignmentWork();
    aw.setP(p);
    aw.writeAssignment("I am working on it");
  }
}
