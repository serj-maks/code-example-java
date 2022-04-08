## 01
```
package com.java;

public class A {

	String msg="Try to access default variable 
	outside the package";
}
```

```
package com.javatpoint;

import com.java.A;

public class DefaultExample {

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.msg);
	}
}
// Output: Exception in thread "main" java.lang.Error: Unresolved compilation problem:
// The field A.msg is not visible
```
