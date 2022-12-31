## HashSet methods
### addAll()
```java
// будут объеденены все элементы, пересечения (дубликаты) удаляться
// union - объеденение
HashSet<Integer> union = new HashSet<>(hashSet1);
union.addAll(hashSet2);
```

### retainAll()
```java
// будут объеденены все пересечения (дубликаты), НЕпересечения удалятся
// intersect - пересечения
HashSet<Integer> intersect = new HashSet<>(hashSet1);
intersect.retainAll(hashSet2);
```

### removeAll()
```java
// будут удалены все объекты 'hashSet2', включая пересечения(дубликаты)
// subtract - разность
HashSet<Integer> subtract = new HashSet<>(hashSet1);
subtract.removeAll(hashSet2);
```
