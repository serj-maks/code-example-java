## array creating
### 01 
```
// задаем значение длинны массива и устанавлием в массив
int n = 12
int mas1[] = new int[n];  
mas1[0] = 31;  
mas1[1] = 28;  
```

### 01 
```
// массив автоматически создается нужной велечины
int mas2[] = {31, 28, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31};  
System.out.println("days in January: " + mas2[0]);
```


## other code examples
### 01 
```
// перебор массива через цикл `for`
int mas3[] = {1,2,3,4,5};  
int i;  
for(i=0; i<5; i++) {
	/*
	переменная i поочередно присваивается каждому элементу каждой
	ячейки массива и выводит на консоль значения элементов массива 
	по порядку
	*/
  System.out.println(mas3[i]+" ");   
}
```


### 01
```
// вывод длинны массива при помощи метода `length`  
int mas4[] = new int[10];  
System.out.println("mas4 length = " + mas4.length);
```

### 01
```
// int n = 12
// int mas1[] = new int[n];  
// mas1[0] = 31;  
// mas1[1] = 28;  

// add value in last array cell (cell - ячейка)
mas1[n-1] = 31;
System.out.println("days in February: " + mas1[1]);
```
