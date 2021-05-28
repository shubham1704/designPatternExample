package structuralDesignPatter.adapterDesignPattern;

public class AssignmentWork {

  private Pen p;

  public void setP(Pen p) {
    this.p = p;
  }

  public Pen getP() {
    return p;
  }

  public void writeAssignment(String str){
    p.write(str);
  }

}
