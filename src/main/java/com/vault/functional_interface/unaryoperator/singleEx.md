## lambda-expression
```
UnaryOperator<Integer> unary = x -> -x;
System.out.println(unary.apply(3)); // Output: -3
```


## method reference
```
// for method reference using you must create special method
public static Integer negative(Integer number) {
	return -number;  
}  

UnaryOperator<Integer> unary2 = Main::negative;  
System.out.println(unary2.apply(3));  // Output: -3
```