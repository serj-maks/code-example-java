## 01
```
BinaryOperator<Integer> addition = (x, y) -> x + y;
System.out.println(addition.apply(2, 3)); // 5
System.out.println(addition.apply(4, 5)); // 9
```


## lambda-expression
```
BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;   
System.out.println(binaryOperator.apply(2,4));
```


## method reference
```
// for method reference using you must create special static method
public static Integer multiply(Integer a, Integer b) {  
  	return a * b;  
}  
BinaryOperator<Integer> binaryOperator = Main::multiply; 
System.out.println(binaryOperator.apply(2,4));  
```
