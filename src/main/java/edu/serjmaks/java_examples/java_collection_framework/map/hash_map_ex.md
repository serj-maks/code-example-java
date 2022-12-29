## HashMap methods
### putIfAbsent()
```java
// putIfAbsent() проверяет, есть ли элемент коллекции с таким ключем. Если есть,
// перезаписи, как при обычном put(), НЕ БУДЕТ
Map<Integer, String> map = new HashMap<>();
map.put(1000, "Sergey");
map.put(2000, "Dmitry");
map.putIfAbsent(1000, "Nikolay");
```

### keySet()
```java
// выводит Set, который содержит только key
Map<Integer, String> map = new HashMap<>();
map.put(1000, "Sergey");
map.put(2000, "Dmitry");
System.out.println(map.keySet());
// Output: [1000, 2000]
```

### values()
```java
// выводит Set, который содержит только value
Map<Integer, String> map = new HashMap<>();
map.put(1000, "Sergey");
map.put(2000, "Dmitry");
System.out.println(map.values());
// Output: [Sergey, Dmitry]
```
