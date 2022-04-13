package com.vault.nested_classes.local_class;

public class Cat {

  private String name;

  /*
  инициализатор
   */
  {
    String name = "";
  }

  Cat() {

  }

  Cat(String name) {
    this.name = name;
  }

  /*
  local class - класс внутри метода
  получилось, что кошка каждый раз генерирует новые ноги перед тем, как начать бежать
   */
  void run() {
    class Foot {
      void footRun() {
        System.out.println("Кошка по имени " + name + " бежит!");
      }
    }

    Foot foot = new Foot();
    System.out.println("создан экземпляр класс Foot");
    foot.footRun();
  }
}
