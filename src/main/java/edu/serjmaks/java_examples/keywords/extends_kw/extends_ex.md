## 01
```
public class Door {
    protected int price;

    //Этот метод тоже наследуется
    protected void doSomething() {
        System.out.println("Door is doing something");
    }

    //Этот метод доступен исключительно в классе Door
    private void onlyForDoor() {

    }
}
```

```
//Железная дверь
public class IronDoor extends Door {
    //Уровень защиты определен только для железных дверей
    private int protectionLvl;

    IronDoor(int price, int protectionLvl) {
        this.price = price;
        this.protectionLvl = protectionLvl;
    }
}
```

```
//Деревянная дверь
public class WoodDoor extends Door {
    //Характеристика "порода древесины" доступна только деревянной двери
    private String woodType;

    WoodDoor(int price, String woodType) {
        this.price = price;
        this.woodType = woodType;
    }
}
```
