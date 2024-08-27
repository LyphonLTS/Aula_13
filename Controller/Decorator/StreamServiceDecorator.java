package Controller.Decorator;

import Controller.StreamService;
import Interface.IService;

public class StreamServiceDecorator implements IService {
  private StreamService streamService;

  public StreamServiceDecorator(StreamService streamService) {
    this.streamService = streamService;
  }

  @Override
  public String getDescription() {
    return this.streamService.getDescription();
  }

  @Override
  public String getName() {
    return this.streamService.getName();
  }

  @Override
  public double getPrice() {
    return this.streamService.getPrice();
  }

  @Override
  public String toString() {
    return "Name: " + this.getName() + "\nDescription: " + this.getDescription() + "\nPrice: R$" + this.getPrice();
  }
}
