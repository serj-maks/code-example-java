## 01
```
private void printData(final int day, final String month, final int year) {
    //  в конструктор StringBuilider можно передать размер резервируемого массива
    final StringBuilder stringBuilder = new StringBuilder(30)
        .append("Today is: ")
        .append(day)
        .append(" ")
        .append(month)
        .append(" ")
        .append(year);
    System.out.println(stringBuilder);    
}
```


## вариант записи StringBuilder №2
```
private void printData(final int day, final String month, final int year) {
    System.out.println(new StringBuilder(30)
        .append("Today is: ")
        .append(day)
        .append(" ")
        .append(month)
        .append(" ")
        .append(year))j;
}
```