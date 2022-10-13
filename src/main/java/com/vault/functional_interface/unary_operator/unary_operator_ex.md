## 01
```
// definition
// lambda-expression style

UnaryOperator<Integer> unary = x -> -x;
System.out.println(unary.apply(3)); // Output: -3
```


## 01
```
// definition
// method reference style

// for method reference using you must create special method
public static Integer negative(Integer number) {
	return -number;  
}  

UnaryOperator<Integer> unary = Main::negative;  
System.out.println(unary.apply(3));  // Output: -3
```
