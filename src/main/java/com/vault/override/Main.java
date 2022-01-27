package com.vault.override;

public class Main {
  public static void main(String[] args) {
    SuperClass sup = new SubClass();
    sup.getNb();
    SubClass sub = new SubClass();
    sub.getNb();
  }
}
