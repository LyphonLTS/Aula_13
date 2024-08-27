package Controller.Decorator;

import Controller.StreamService;

public class Package4 extends StreamServiceDecorator {
  public Package4(StreamService streamService) {
    super(streamService);
  }

  @Override
  public String getDescription() {
    return "Cartão de crédito Platinum";
  }

  @Override
  public String getName() {
    return "Pacote 4";
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 40;
  }

  @Override
  public String toString() {
    return "Name: " + this.getName() + "\nDescription: " + this.getDescription() + "\nPrice: R$" + this.getPrice();
  }
}
