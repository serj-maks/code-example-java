## 01
```
Consumer<Integer> printer = x -> System.out.printf("%d dollars \n", x);
printer.accept(1000); 
```