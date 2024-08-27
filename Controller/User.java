package Controller;

import Interface.IService;

public class User {
  private String name;
  private IService service;

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public IService getService() {
    return this.service;
  }

  public void setService(IService service) {
    this.service = service;
  }

  @Override
  public String toString() {
    return "Name: " + this.getName() + "\nService: " + this.getService();
  }
}
