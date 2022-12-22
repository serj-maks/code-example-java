## 01
```
// definition
// объявление перечислений внутри класса

public class Main {

    enum Directions {
        NORTH,
        SOUTH,
        EAST,
        WEST;
    }

    public static void main(String[] args) {
        // enum keyword is not required to create a new object reference
        Directions d1 = Directions.EAST;
        System.out.println(d1);
    }
} // Outputs: EAST
```


## 01
```
// definition
// объявление перечислений вне класса

enum Directions{
    NORTH,
    SOUTH,
    EAST,
    WEST;
}
```

```
public class Main {
    public static void main(String[] args) {
        // enum is not required to create a new object reference
        Directions d1 = Directions.EAST;
        System.out.println(d1);
    }
} // Outputs: EAST
```


## 01
```
// definition
// использование кастомного конструктора

public enum Figure {
    // в скобочках (конструкторе) указано, что передавать в кастомный конструктор
    X("X"),
    O("O");
    
    Figure(final Figure figure) {
        assert Figure != null;
        this.figure = figure;
    }
    
    public String getFigure() {
        return figure;
    }   
}
```


## 01
```
enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST;
}
```

```
// definition
// выводим все значения класса Direction

public class Main {

    public static void main(String[] args) {
        // выводим все значения класса Direction
        for (Direction direction : Direction.values()) {
        System.out.println(direction);
    }   
}
// Output:
// NORTH
// SOUTH
// EAST
// WEST
```
