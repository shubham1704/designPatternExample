package creational.builderDesignPattern;

public class PhoneFactory {

  private String os;
  private int ram;
  private String processor;
  private double screenSize;
  private int batteryCapacity;

  public PhoneFactory setOs(String os) {
    this.os = os;
    return this;
  }

  public PhoneFactory setRam(int ram) {
    this.ram = ram;
    return this;
  }

  public PhoneFactory setProcessor(String processor) {
    this.processor = processor;
    return this;
  }

  public PhoneFactory setScreenSize(double screenSize) {
    this.screenSize = screenSize;
    return this;
  }

  public PhoneFactory setBatteryCapacity(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
    return this;
  }

  public Phone getPhone(){
    return new Phone(os, ram, processor, screenSize, batteryCapacity);
  }

}
