## without parameters
```
Runnable runnable = () -> System.out.println("hello");
runnable.run();
```


## with parameters
```
SqrtInterface sqrtLambda = x -> Math.sqrt(x);
System.out.println(sqrtLambda.sqrtMethod(2.0));
```


## single (одиночные)
```
SumInterface sumLambda = (int a, int b) -> a+b;  
System.out.println(sumLambda.sumMethod(10,20));
```


## block (блочные)
```
SumInterface sumLambda = (int a, int b) -> {  
  return a+b;  
};  
System.out.println(sumLambda.sumMethod(10,20));
```
