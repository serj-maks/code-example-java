## 01
```
// definition
// without parameters

Runnable runnable = () -> System.out.println("hello");
runnable.run();
```


## 01
```
// definition
// with parameters

SqrtInterface sqrtLambda = x -> Math.sqrt(x);
System.out.println(sqrtLambda.sqrtMethod(2.0));
```


## 01
```
// definition
// single (одиночные)

SumInterface sumLambda = (int a, int b) -> a+b;  
System.out.println(sumLambda.sumMethod(10,20));
```


## 01
```
// definition
// block (блочные)

SumInterface sumLambda = (int a, int b) -> {  
  return a+b;  
};  
System.out.println(sumLambda.sumMethod(10,20));
```
