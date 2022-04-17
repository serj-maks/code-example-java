## lambda-expression
```
Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
System.out.println(supplier.get());
```


## method reference
```
// for method reference using you must create special method
public static Integer getRandomInteger() {
	return (int) (Math.random() * 10);
	}	
		
Supplier<Integer> supplier = Main:getRandomInteger
System.out.println(supplier.get());
```
