package com.vault.abstract_interface;

class Main {
  public static void main(String[] args) {
    Plane superjet = new Plane();
    superjet.fly();

    Fly moskito = new Fly();
    moskito.fly();

    Umbrella litteumbrella = new Umbrella();
    litteumbrella.fly();
  }
}
