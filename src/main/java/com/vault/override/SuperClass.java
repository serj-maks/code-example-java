package com.vault.override;//  использование аннотации @Override

//  супер класс, который будет расширен - родитель
class SuperClass {
  // метод, который будет переопределен
  public void getNb() {
    System.out.println("hello from super class!");
  }
}