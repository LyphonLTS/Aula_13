package Controller.Decorator;

import Controller.StreamService;

public class Package1 extends StreamServiceDecorator {
  public Package1(StreamService streamService) {
    super(streamService);
  }

  @Override
  public String getDescription() {
    return "Permite assistir vídeos em vários dispositivos";
  }

  @Override
  public String getName() {
    return "Pacote 1";
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
