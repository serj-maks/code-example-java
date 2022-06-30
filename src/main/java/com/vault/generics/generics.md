## добавление новых типов в уже существующий пример
```java
public class TwoTuple<A,B> {

    /*
    почему поля без модификатора `private' и без getter'ов ?
    объявление полей 'final' обеспечивает тот-же уровень безопасности
    и при этом запись выглядить более коротко и просто
    */
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }
}
```

```java
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {

    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }
}
```
