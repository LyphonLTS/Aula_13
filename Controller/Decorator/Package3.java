package Controller.Decorator;

import Controller.StreamService;

public class Package3 extends StreamServiceDecorator {
  public Package3(StreamService streamService) {
    super(streamService);
  }

  @Override
  public String getDescription() {
    return "Caixa surpresa com produtos relacionados a filmes e séries";
  }

  @Override
  public String getName() {
    return "Pacote 3";
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 20;
  }

  @Override
  public String toString() {
    return "Name: " + this.getName() + "\nDescription: " + this.getDescription() + "\nPrice: R$" + this.getPrice();
  }
}
