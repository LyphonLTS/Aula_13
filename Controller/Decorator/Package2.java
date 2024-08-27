package Controller.Decorator;

import Controller.StreamService;

public class Package2 extends StreamServiceDecorator {
  public Package2(StreamService streamService) {
    super(streamService);
  }

  @Override
  public String getDescription() {
    return "Frete Grátis em produtos";
  }

  @Override
  public String getName() {
    return "Pacote 2";
  }

  @Override
  public double getPrice() {
    return super.getPrice();
  }

  @Override
  public String toString() {
    return "Name: " + this.getName() + "\nDescription: " + this.getDescription() + "\nPrice: R$" + this.getPrice();
  }
}
