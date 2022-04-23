## stream creating
### collections 
#### 01
```
// List<String> inputList = new ArrayList<>();
// inputList.add("one");
// inputList.add("two");
// inputList.add("three");

inputList.stream().forEach(x -> System.out.println(x));
```

#### 01
```
// List<String> inputList = new ArrayList<>();
// inputList.add("one");
// inputList.add("two");
// inputList.add("three");

// запись в переменную
List<String> outputList = inputList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
```

### value
#### 01
```
// List<String> inputList = new ArrayList<>();
// inputList.add("one");
// inputList.add("two");
// inputList.add("three");

Stream.of("one", "two", "three").forEach(x -> System.out.println(x));
```

### primitive type
#### 01
```
Stream.of(1, 2, 3, 4, 5).forEach(x -> System.out.println(x));
```

#### 01
```
IntStream intS = IntStream.of(9, 8, 7);
```

### array
#### 01
```
Arrays.stream(inputArray).forEach(x -> System.out.println(x));
```

#### 01
```
 // запись в переменную
 int[] outputArray = Arrays.stream(inputArray).map(x -> {
     if (x % 3 == 0) {
         x = x / 3;
     }
     return x;
 }).toArray();
```

### file
#### 01
```
Stream<String> fromFileS = Files.lines(Paths.get("doc.txt"))
```


## stream api methods
### map()
```
// изменяет внешний вид элементов
// i
// преобразуем каждый элемент коллекции из типа `String` в тип `Integer`, выводим количество букв каждого элемента
List<Integer> mapList = inputList.stream().map(x -> x.length()).collect(Collectors.toList());
```

### flatMap()
```
// 
// i

// List<Human> humans = asList(
//        new Human("Sam", asList("Buddy", "Lucy")),
//        new Human("Bob", asList("Frankie", "Rosie")),
//        new Human("Marta", asList("Simba", "Tilly")));

List<String> petNames = humans.stream()
        .map(human -> human.getPets())  // преобразовываем Stream<Human> в Stream<List<Pet>>
        .flatMap(pets -> pets.stream()) // "разворачиваем" Stream<List<Pet>> в Stream<Pet>
        .collect(Collectors.toList());
```

### filter() 
```
// выбирает нужные элементы
// lazy
List<String> filterList = inputList.stream().filter(x -> x.startsWith("t")).collect(Collectors.toList());
```

### forEach()
```
// возвращает `void`
// eager
Arrays.stream(inputArray).forEach(x -> {
    x*=2;
    System.out.println(x);
});
```

### reduce()
```
// преобразовывает все элементы в один объект
// eager

// int[] inputArray = {3, 1, 9, 11, 8};
int reduceArray = Arrays.stream(inputArray).reduce(1, (accum, x) -> accum+x);
System.out.println(reduceArray);
```

### collect()
```
// собирает элементы в заданную коллекцию при помощи статических методов класса Collectors
// eager
List<String> collectList = inputList.stream().filter(x -> x.length() <= 3).collect(Collectors.toList());
```

### min(), max()
```
// получаем минимальное и максимальное значение
// lazy
int min = Stream.of(1,2).min(Comparator.comparing(x -> x)).get();
int max = Stream.of(1,2).max(Comparator.comparing(x -> x)).get();
```

### sorted()
```
// сортирует элементы
// lazy
Stream.of("one", "two").sorted().collect(Collectors.toList());
```

### limit()
```
// ограничиваем объекты по заданному критерию
// lazy
Stream.of("one", "two").limit(1).collect(Collectors.toList());
```

### distinct()
```
// когда в коллекции есть повторяющиеся значения и не нужно, чтобы они повторялись
// lazy
Stream.of("one", "one").distinct().collect(Collectors.toList());
```

### skip()
```
// сколько значений нужно пропустить
// lazy
Stream.of("one", "one").skip(1).collect(Collectors.toList());
```

### findAny()
```
// возвращает Optional<T>, хранящий некоторый элемент стрима, или пустой Optional<T>, 
// если стрим пуст. Поведение этой операции не определено - он может выбрать любой элемент в потоке
// lazy
Stream.of("one", "two").filter(x -> x.equals("one")).findAny().get();
```

### findFirst()
```
// возвращает строго первый элемент потока
// lazy
Stream.of("one", "two").filter(x -> x.equals("one")).findFirst().get();
```

### peek()
```
// как и метод map() заменяет все элементы в стриме
// lazy
Stream.of("one", "two").peek(x -> x.toUpperCase()).findFirst().get();
```

### mapToInt()
```
// работает как map(), только вернет числовой stream
// lazy
Stream.of(1, 2).mapToInt(x -> x).sum();
```

## other code examples
### 01
```
// int[] inputArray = {1,2,3,4,5};

// Input: 1 2 3 4 5
int[] outputArray = Arrays.stream(inputArray).map(x -> {
    if (x % 2 == 0) {
        x = x / 2;
    }
    return x;
}).toArray();
System.out.println(Arrays.toString(outputArray));
// Output: 1 1 3 2 5
```

### 01
```
// int[] inputArray = {1,2,3,4,5};

// Input: 1 2 3 4 5
Arrays.stream(inputArray).map(x -> {
    if (x % 2 == 0) {
        x = x / 2;
    }
    return x;
}).forEach(x -> System.out.println(x));
// Output: 1 1 3 2 5
```
