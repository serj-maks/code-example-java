## объявление перечислений внутри класса
```java
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


## объявление перечислений вне класса
```java
enum Directions{
    NORTH,
    SOUTH,
    EAST,
    WEST;
}
```

```java
public class Main {
    public static void main(String[] args) {
        // enum is not required to create a new object reference
        Directions d1 = Directions.EAST;
        System.out.println(d1);
    }
} // Outputs: EAST
```


## использование кастомного конструктора
```java
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