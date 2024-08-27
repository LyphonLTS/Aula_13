package Controller;

import Interface.IService;

public class StreamService implements IService {
  private String description;
  private String name;
  private double price;

  public StreamService() {
    this.description = "Permite assistir vídeos num único dispositivo";
    this.name = "Assinatura base";
    this.price = 9.99;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + "\nDescription: " + this.description + "\nPrice: R$" + this.price;
  }
}
