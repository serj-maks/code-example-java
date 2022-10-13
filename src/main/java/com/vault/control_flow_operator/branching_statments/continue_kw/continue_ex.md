## 01
```
// definition
// с меткой передает управление заголовку оператора цикла, помеченного соответствующей меткой

int counter = 0; 
compare: 
for (int rowNum = 0; rowNum < 3; rowNum++) {
	for (int colNum = 0; colNum < 4; colNum++) { 
		if (colNum == 3) { 
			counter++; 
			continue compare; 
		} 
	} 
}
```


## 01
```
// definition
// без метки передает управление в начало глобоко вложенного цикла

int counter = 0; 
for (int rowNum = 0; rowNum < 3; rowNum++) {
	for (int colNum = 0; colNum < 4; colNum++) {
		if (colNum != 3) { 
			continue; 
		} 
		counter++; 
	} 
}
```


## 01
```
// definition
// вывод 2х чисел на одной строке. Если число четное - цикл продолжается без перехода на новую строку, нет - выполняется тело условия - отступ

for (int i = 0; i < 10; i++) {  
	System.out.print(i + " ");  
 	if (i % 2 == 0) continue; {  
  	System.out.println();  
  }  
}
```
