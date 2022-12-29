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
// является встроенным итератором
Map<Integer, String> map = new HashMap<>();
map.put(1000, "Sergey");
map.put(2000, "Dmitry");
System.out.println(map.keySet());
// Output: [1000, 2000]
```

### values()
```java
// выводит Set, который содержит только value
// является встроенным итератором
Map<Integer, String> map = new HashMap<>();
map.put(1000, "Sergey");
map.put(2000, "Dmitry");
System.out.println(map.values());
// Output: [Sergey, Dmitry]
```

### entrySet()
```java
// выводит Set, который содержит key и value
// является встроенным итератором
Map<Integer, String> map = new HashMap<>();
map.put(1000, "Sergey");
map.put(2000, "Dmitry");
System.out.println(map.entrySet());
```


## 01
```java
// пример использования встроенного итератора entrySet()
for (Map.Entry<String, String> entry: hashmap.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```


## 01
```java
// пример использования встроенного итератора keySet()
for (String key: hashmap.keySet()) {
    System.out.println(hashmap.get(key));
}
```


## 01
```java
// создание объекта типа Iterator
Iterator<Map.Entry<String, String>> itr = hashmap.entrySet().iterator();
while (itr.hasNext()) {
    System.out.println(itr.next());
}
```
