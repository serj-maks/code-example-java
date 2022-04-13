## 01
```java
public class Demo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(8);
        hashSet2.add(5);
    }
}
```


## HashSet methods
### addAll()
```
// будут объеденены все элементы, пересечения (дубликаты) удаляться
// union - объеденение
HashSet<Integer> union = new HashSet<>(hashSet1);  
union.addAll(hashSet2);  
```

### retainAll()
```
// будут объеденены все пересечения (дубликаты), НЕпересечения удалятся
// intersect - пересечения
HashSet<Integer> intersect = new HashSet<>(hashSet1);  
intersect.retainAll(hashSet2); 
```

### removeAll() 
```
// будут удалены все объекты 'hashSet2', включая пересечения(дубликаты)
// subtract - разность
HashSet<Integer> subtract = new HashSet<>(hashSet1);  
subtract.removeAll(hashSet2); 
```
