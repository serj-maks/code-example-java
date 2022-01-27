package com.vault.abstractinterface;

public class Plane implements Flyable {

  @Override
  public void fly() {
    System.out.println("Plane is flying");
  }
}
