package creational.builderDesignPattern;

public class Shop {

  public static void main(String[] args) {

    /**
     * Here we have to remember All the Parameter and also sequence of the parameter
     * Even though you don't want to specify the parameter you have to remember the datatype of parameter and sequence as well
     */
    Phone p = new Phone("Android", 4, "Qualcom", 5.5, 5000);

    /**
     * Now Using Builder Pattern we don't have to remember any parameter name
     * Here we can get the {@code Phone} object without specifying any parameter as well
     *
     */

    PhoneFactory pb = new PhoneFactory();

    Phone p1 = pb.setOs("Android").getPhone();
    Phone p2 = pb.setOs("Android").setRam(2).setProcessor("Qualcom").getPhone();

    System.out.println(p);
    System.out.println(p1);
    System.out.println(p2);

  }

}
