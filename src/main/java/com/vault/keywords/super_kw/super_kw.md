## 01
```java
public class SuperClass {
    int num = 100;
}
```

```java
public class SubClass extends SuperClass {
    
    int num = 200;

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        // 100
        subClass.printNum();
    }

    void printNum() {
        System.out.println(super.num);
    }
}
```
