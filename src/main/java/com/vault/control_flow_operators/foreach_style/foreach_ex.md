## 01
```
int mas[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
int s = 0;  
  
for (int x : mas) {  
	System.out.println("x = " + x);  
	s += x;  
}  
System.out.println("s = " + s);
```


## 01
```
// цикл будет повторяться до тех пор,пока не будет перебрана вся коллекция,
// но при помощи оператора `break` можно остановить цикл,
// как будет получено пятое значение элемента массива 
int mas[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
int s = 0;  
   
for (int x : mas) {  
	System.out.println("x = " + x);  
	s += x;  
	if (x == 5) break;  
}
System.out.println("sum of five elements = " + s);
```
