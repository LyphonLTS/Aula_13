package Controller.Decorator;

import Controller.StreamService;

public class Package5 extends StreamServiceDecorator {
  public Package5(StreamService streamService) {
    super(streamService);
  }

  @Override
  public String getDescription() {
    return "Compra com Cash Back";
  }

  @Override
  public String getName() {
    return "Pacote 5";
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 10;
  }

  @Override
  public String toString() {
    return "Name: " + this.getName() + "\nDescription: " + this.getDescription() + "\nPrice: R$" + this.getPrice();
  }
}
