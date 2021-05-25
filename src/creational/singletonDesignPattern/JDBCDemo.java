package creational.singletonDesignPattern;

public class JDBCDemo {

  static int count=1;

  public static void main(String[] args) {

    JDBCSingleton jdbc= JDBCSingleton.getInstance();

    try {
      int i= jdbc.insert("Shubham", "something");
      if (i>0) {
        System.out.println((count++) + " Data has been inserted successfully");
      }else{
        System.out.println("Data has not been inserted ");
      }

    } catch (Exception e) {
      System.out.println(e);
    }

    try  {
      jdbc.view("Shubham");
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      int i= jdbc.delete(1);
      if (i>0) {
        System.out.println((count++) + " Data has been deleted successfully");
      }else{
        System.out.println("Data has not been deleted");
      }

    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      int i= jdbc.update("Shubham", "IDontKNow");
      if (i>0) {
        System.out.println((count++) + " Data has been updated successfully");
      }

    } catch (Exception e) {
      System.out.println(e);
    }



  }

}
