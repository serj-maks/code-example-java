## 01
```
switch (выражение_для_выбора) {
	case значение_1:
		код_1;
		break;
	case значение_2:
		код_2;
		break;
	...
	case значение_n:
		код_n;
		break;
	default:
		код_выбора_по_умолчанию;
		break;
	}
```


## calculate the weekday name
```
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
} // Outputs "Thursday" (day 4
```


## 01
```
public class Example {
    public static void main (String args []) {
        int n;
        n = 2;

        switch(n) {
            case 1:
            System.out.println("1");
        break;
        // подряд идущим конструкциям case 1 и case 2 можно присвоить один и тот же код
        case 2:
        case 3:
            System.out.println("2");
        break;
	    default:
	    break;
        }
    }
}
```
