## 01
```
Function<Integer, String> function = x -> String.valueOf(x) + "dollars";
System.out.println(function.apply(10)); 
```

## 01
```
// definition
// lambda-expression style

Function<String, Integer> function = a -> a.lenght();
System.out.println(function.apply("Hello, World!"));
```


## 01
```
// definition
// method reference style

Function<String, Integer> function = String::lenght;
System.out.println(function.apply("Hello, World!"));
```
