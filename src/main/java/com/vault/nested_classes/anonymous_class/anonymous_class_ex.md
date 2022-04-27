## реализация (implements) интерфейса при помощи анонимного класса
```
interface Hello {
    void sayHello()
}
```

```
public class Foo {
    // анонимный класс, который реализует интерфейс Hello
    static Hello hello = new Hello(); {
        @Override
        public void sayHello() {
        System.out.println("hello from anonymous class!");
        }
    } 
}
```

```
public class Demo {
    public static void main(String[] args) {
        hello.sayHello();
    }
}
```


## наследование (extends) от определенного класса
```
public class Foo {
    public void show() {
        System.out.println("hello from superclass method!");
    }
}
```

```
public class TestClass {
    // анонимный класс наследуется от класса Foo
    static Foo foo = new Foo() {
        @Override
        public void show() {
            super.show();
            System.out.println("hello from anonymous class method!");
        }
    }
}
```

```
public class Demo {
    public static void main(String[] args) {
        foo.show();
    }
}
```


## how java see anonymous class
```
package edu.serjmaks.streams;

public class Main
    public static void main(String[] args) {
        Runnable obj = new Runnable() {
            @Override
            public void run() {
            
            }
        };
        // public class Main$1 implements Runnable {
        //     @Override
        //         public void run() {
        //        
        //         }
        // }
        System.out.println(obj.getClass().getName());
        // Output: edu.serjmaks.streams.Main$1
    }
```
