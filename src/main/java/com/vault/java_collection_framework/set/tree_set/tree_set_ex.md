```
public class Main {  
	public static void main(String[] args) {  
		TreeSet<Integer> treeSet = new TreeSet<>();  
 		treeSet.add(2);  
 		treeSet.add(4);  
 		treeSet.add(1);  
 		treeSet.add(3);  
 		treeSet.add(5);  
 		System.out.println(treeSet);  
 	}  
}
```


## TreeSet methods
### first()
```
// выводит первый по списку элемент коллекции
treeSet.first();
```

### last()
```
// выводит первый по списку элемент коллекции
treeSet.last();
```

### headSet();
```
// выводит элементы из головы, НЕ ВКЛЮЧАЯ вводимое значение
treeSet.headSet(2);
```

### tailSet();
```
// выводит элементы из хвоста, ВКЛЮЧАЯ вводимое значение
treeSet.tailSet(4);
```

### subSet();
```
// выводит элементы между заданными
treeSet.subSet(1,4);
```
