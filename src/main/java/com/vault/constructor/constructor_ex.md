## 01
```
public class Man {

    private int age;
    
    // дефолтный конструктор создает объект, где уже
    // установлено значение поля age = 0;
    Man() {
        this.age = 0;
    }
}
```


## 01
```java
public class Box {
    
    private int number;
    
    // вызови конструктор, который на вход принимает int
    // и передает туда 1
    Box() {
        this(1);
    }

    // и теперь, если кто будет использовать конструктор без входных аргументов,
    // автоматически перенаправялется в конструктор 
    // с входными аргументами и сюда передается 1
    Box(final int number) {
        assert number != 0;
        this.number = number;
    }
}
````


## 01
```
class Box {

private double wight;
private double height;
private double depth;

  // empty constructor
  Box(){

  }

  // constructor with parameters
  Box(double wight, double height, double depth) {
    this.wight = wight;
    this.height = height;
    this.depth = depth;
  }

  Box(double len){
    wight = height = depth = len;
  }

  double volume() {
    return wight*height*depth;
  }
}
```

```
public class Main {

  public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box(2,3,5);
    Box box3 = new Box(10);

    // option 1
    double a = box1.volume();
    System.out.println(a);

    // option 2
    System.out.println(box1.volume());
  }
}
```


## 01
```java
public class Dog {
    
    private String name;
    
    Dog(final String name) {
        assert name != null;
        this.name = name;
    }
}
```

```java
    public class Puppy extends Dog {
   
    // вызываю конструктор верхнего уровня и когда я создаю
    // объект класса Puppy, то я иду в конструктор верхнего
    // уровня и вызываю тот конструктор,
    // который на вход ожидает name
    Puppy(String name) {
        super(name);
    }
}
```
