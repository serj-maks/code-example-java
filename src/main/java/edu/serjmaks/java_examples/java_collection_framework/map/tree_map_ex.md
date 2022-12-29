## TreeMap methods
### put()
```
// добавить элемент в коллекцию
treeMap.put(20, "volvo");
```

### get()
```
// выводит value по key, если такого key нет, вместо value будет выведен null
treeMap.get(20);
```

### remove()
```
// удалить
treeMap.remove(20);
```

### descendingMap()
```
// переворачивает порядок коллекции. Теперь все элементы лежат по убыванию
treeMap.descendingMap();
```

### headMap()
```
// обрезает "голову ", включая введенный `key` коллекции и выводит список элементов
treeMap.headMap(20);
```

### tailMap()
```
// обрезает "хвост", включая введенный `key` коллекции и выводит список элементов
treeMap.tailMap(20);
```

### firstEntry()
```
// выводим элемент, который был первым входящим в коллекцию, т.е. первый элемент
treeMap.firstEntry();
```

### lastEntry()
```
// выводим элемент, который был последним входящим в коллекцию, т.е. последний элемент
treeMap.lastEntry();
```


## 01
```
// если значение `key` повторяется, то вся пара `key`-`value` будет заменена последней добавленной,
// т.е. новой парой `key`-`value`
treeMap.put(20, "volvo");
treeMap.put(10, "lada");
treeMap.put(30, "mazda");
treeMap.put(10, "BMW");
```


## 01
```
public class Student implements Comparable {

	private String name;
	private String surname;
	private int course;

	// some constructors, getters, setters, methods and @Override toString

	// как имплементировать интерфейс `Comparable` и сравнить по полю
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
}
```
