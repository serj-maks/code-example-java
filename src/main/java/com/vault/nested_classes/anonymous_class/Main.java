package com.vault.nested_classes.anonymous_class;

interface Event {
  void run();
}

class Button {

  Event start;

  Button(Event start) {
    this.start = start;
  }

  public void click() {
    start.run();
  }
}

public class Main {
  public static void main(String[] args) {

    /*
    пример анонимного внутреннего класса, где отделяем метод обработки событий (click()) от реализации класса "Button"
     */
    Button btn = new Button(new Event() {
      @Override
      public void run() {
        System.out.println("clicked!");
      }
    });

    btn.click();
  }
}
