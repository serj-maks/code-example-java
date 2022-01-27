package com.vault.override;

//  дочерний класс, расширяющий супер класс
class SubClass extends SuperClass {
    // переопределение
    @Override
    public void getNb() {
      System.out.println("hello from sub class");
  }
}
