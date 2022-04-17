## 01
```
Function<Integer, String> function = x -> String.valueOf(x) + "dollars";
System.out.println(function.apply(10)); 
```

## lambda-expression
```
Function<String, Integer> function = a -> a.lenght();
System.out.println(function.apply("Hello, World!"));
```


## method reference
```
Function<String, Integer> function = String::lenght;
System.out.println(function.apply("Hello, World!"));
```
