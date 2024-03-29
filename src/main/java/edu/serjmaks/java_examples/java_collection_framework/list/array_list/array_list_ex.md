## create collection
```
ArrayList<Car> cars = new ArrayList<Car>();
```

```
ArrayList<Car> cars = new ArrayList<>();
```

```
// можно задать изначальную длинну массива, передав в конструктор
// этот параметр называется initialCapacity
ArrayList<Car> cars = new ArrayList<>(30);
```

```
// можно передать в конструктор другой обеъкт ArrayList того-же типа
ArrayList<Cars> newCars = new ArrayList<>(cars);
```

```
List<Car> cars = new ArrayList<>();
```


## adding elements
### add elements to "cars" collection #1
```
// ArrayList<Car> cars = new ArrayList<>();
// Car volvo = new Car("XS90",130);
// Car lada = new Car("priora",90);

cars.add(volvo);
cars.add(lada);
```

### add elements to "cars" collection #2
```
// ArrayList<Car> cars = new ArrayList<>();
// Car volvo = new Car("XS90",130);
// Car lada = new Car("priora",90);

Collections.addAll(cars, volvo, lada, bmw);
```

### add elements to "cars" collection #3
```
// ArrayList<Car> cars = new ArrayList<>();

Collections.addAll(cars, new Car("XS90", 130), new Car("priora", 90), new Car("X5", 150));
```

### add elements to "cars" collection #4
```
// Car lada = new Car("priora",90);
// Car bmw = new Car("X5",150);

ArrayList<Car> cars = new ArrayList<>(Arrays.asList(lada, bmw));
```


## ArrayList methods
### add()
```
// помимо стандартного добавления add(mazda)
// можно указать индекс, в какое место в массиве добавить элемент add(1, mazda)

Car volvo = new Car("XS90",130);
Car lada = new Car("priora",90);
Car bmw = new Car("X5",150);

ArrayList<Car> cars = new ArrayList<>();

Collections.addAll(cars, volvo, lada, bmw);

Car mazda = new Car("3", 120);

// добавить элемент по индексу 1. Теперь все элементы сдвинуты на 1
cars.add(1, mazda);
```

### addFirst()

### addLasLast()

### set()
```
Car volvo = new Car("XS90",130);
Car lada = new Car("priora",90);
Car bmw = new Car("X5",150);
ArrayList<Car> cars = new ArrayList<>();
Collections.addAll(cars, volvo, lada, bmw);
Car mazda = new Car("3", 120);

// заменить значение элемента по идексу 1. Бывыший элемент по индексу 1 будет удален
cars.set(1, mazda);
```

### size()
```
// Car volvo = new Car("XS90",130);
// Car lada = new Car("priora",90);
// Car bmw = new Car("X5",150);
// ArrayList<Car> cars = new ArrayList<>();
// Collections.addAll(cars, volvo, lada, bmw);

// получить размер массива
cars.size();
```

### get()
```
// Car volvo = new Car("XS90",130);
// Car lada = new Car("priora",90);
// Car bmw = new Car("X5",150);
// ArrayList<Car> cars = new ArrayList<>();
// Collections.addAll(cars, volvo, lada, bmw);

// получить объект по индексу (в массиве нумерация начинается с 0)
cars.get(1);
```

### indexOf()
```
// Car volvo = new Car("XS90",130);
// Car lada = new Car("priora",90);
// Car bmw = new Car("X5",150);
// ArrayList<Car> cars = new ArrayList<>();
// Collections.addAll(cars, volvo, lada, bmw);

// получить номер индекса объекта в массиве по ссылке на объект
cars.indexOf(lada);
```

### contains()
```
// Car volvo = new Car("XS90",130);
// Car lada = new Car("priora",90);
// Car bmw = new Car("X5",150);
// ArrayList<Car> cars = new ArrayList<>();
// Collections.addAll(cars, volvo, lada, bmw);

// проверка, содержит ли массив данный объект. Возвращает `true` или `false`
cars.contains(lada);
```

### clear()
```
// Car volvo = new Car("XS90",130);
// Car lada = new Car("priora",90);
// Car bmw = new Car("X5",150);
// ArrayList<Car> cars = new ArrayList<>();
// Collections.addAll(cars, volvo, lada, bmw);

// очистить коллекцию
cars.clear();
```

### remove()
```
// ArrayList<Car> cars = new ArrayList<>();
// Collections.addAll(cars, new Car("XS90", 130), new Car("priora", 90));

// удаление элемента по индексу 0, теперь индексы переприсваиваются
// и элемент с индексом 1 станет с индексом 0 и т.д.
cars.remove(0);
```

### removeFirst()

### removeLast()

### peek()
возвращает первый элемент списка

### peekFirst()
дублирует peek()

### peekLast()
возвращает последний элемент списка

### poll()
возвращает первый элемент списка и удаляет его из листа

### pollFirst()
дублирует poll()

### pollLast()
возвращает последний элемент списка и удаляет его из листа

### pop()
возвращает первый элемент списка и удаляет его из листа

### popFirst()
дублирует pop()

### popLast()
возвращает последний элемент списка и удаляет его из листа

### offer()
добавляет элемент в конец списка

### offerFirst()
добавляет элемент в начало списка

### offerLast()
дублирует offer()


## code examples
### 01
```
// получить список всех объектов проходом массива при помощи переменной `i`
// и вывод на консоль
for (String i : cars) {
  System.out.println(i);
}
```

### 01
```
// сортировка объектов массива по методом `sort()` по алфавиту.
// Если в массиве цифры - сортировка в порядке возрастания
Collections.sort(cars);
for (String i : cars) {
  System.out.println(i);
}
```
