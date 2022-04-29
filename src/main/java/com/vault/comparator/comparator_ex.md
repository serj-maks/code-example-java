## other code examples
### сортировка по нескольким криериям при помощи метода thenComparing()
```
class Person{
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() { 
        return age;
    }
}
```

```
class PersonNameComparator implements Comparator<Person> {

    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
```

```
class PersonAgeComparator implements Comparator<Person> {

    public int compare(Person a, Person b) {
        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}
```

```
public class Demo {
    public static void main(String[] args) {
        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> people = new TreeSet(pcomp);
        people.add(new Person("Tom", 23));
        people.add(new Person("Nick",34));
        people.add(new Person("Tom",10));
        people.add(new Person("Bill",14));
 
        for(Person  p : people){
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
```
