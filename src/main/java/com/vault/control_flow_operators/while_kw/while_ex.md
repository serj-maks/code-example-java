## 01
```
int n = 10;  
while (n > 0) {  
	System.out.println("n= " + n);  
n--;  
}
```


## 02
```
int i = 100, j = 200;  
// данный цикл не имеет тела, т.к.все необходимое выполняется в // условном выражении `(++i < --j)`
while (++i < --j) {  
	System.out.println("average = " + i);  
}
```
