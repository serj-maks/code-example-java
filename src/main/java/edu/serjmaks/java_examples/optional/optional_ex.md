## optional creating
### 01
```
// возвращает Optional-объект
Optional<User> user = Optional.of(new User("Tom", 20));
```

### 01
```
// возвращает Optional-объект, а если нет дженерик-объекта, возвращает пустой Optional-объект
Optional<User> user = Optional.ofNullable(new User("Tom", 20));
```

### 01
```
// возвращает пустой Optional-объект
Optional<User> user = Optional.empty();
```


## optional methods
### ifPresent()
```
Optional<User> userId = Optional.of(repository
                            .findById(userId))
                            .ifPresent(createLog());
```

### isPresent()
```
Boolean present = repository
    .findById(userId)
    .isPresent();
```

### or()
```
Department department = Optional.ofNullable(employee)
        .map(Employee::getDepartment)
        .or(() -> Optional.of(new Department()))
        .get();
```

### orElse()
```
User user = repository
    .findById(userId)
    .orElse(new User());
```

### orElseGet()
```
User user = repository
    .findById(userId)
    .orElseGet(() -> findInAnotherPlace(userId));
```

### orElseThrow()
```
User user = repository
    .findById(userId)
    .orElseThrow(() -> new NoEntityException(userId));
```

### get()
```
User user = repository
    .findById(userId)
    .get();
```

```
// проверка на наличие объекта перед использованием метода get()
Optional<User> optionalUser = repository.findById(userId);
User user = optionalUser
    .isPresent() ? optionalUser.get() : new User();
```

### map()
```
String name = repository
    .findById(userId)
    .map(user -> user.getName())
    .orElseThrow(() -> new Exception());
```

### flatMap()
```

```

### filter()
```

```
