## 01
```
public class Door {
    protected int price;
}
```

```
public class IronDoor extends Door {
    private int protectionLvl;

    IronDoor(int price, int protectionLvl) {
        this.price = price;
        this.protectionLvl = protectionLvl;
    }
}
```

```
public class WoodDoor extends Door {
    private String woodType;

    WoodDoor(int price, String woodType) {
        this.price = price;
        this.woodType = woodType;
    }
}
```

```
public class Demo {
    public static void main(String[] args) {
        Door someDoor = new IronDoor(100, 2);
        System.out.println(someDoor instanceof Door);
    }
}
// Output: true
```
