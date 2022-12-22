## 01
```
public interface Animal {  
    public void animalSound();  
    public void sleep();  
}
```

```
class Pig implements Animal {  
 
    @Override  
    public void animalSound() {  
        System.out.println("wee, wee");  
    }  

    @Override  
    public void sleep() {  
        System.out.println("zzz");  
    }  
}
```

```
public class Cow implements Animal {  
 
    @Override  
    public void animalSound() {  
        System.out.println("moo, moo");  
    }  

    @Override  
    public void sleep() {  
        System.out.println("ZZZ");  
    }  
}
```

```
public class World {  
    public static void main(String[] args) {  
    Pig littlePig = new Pig();  
    littlePig.animalSound();  
    littlePig.sleep();  

    Cow bigCow = new Cow();  
    bigCow.animalSound();  
    bigCow.sleep();  
    }  
}
```
