package com.vault.reflection.ex02;

public class Demo {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        RefGetter refGetter = new RefGetter();
        RefSetter refSetter = new RefSetter();
        RefCloner refCloner = new RefCloner();
        Rabbit rabbit = new Rabbit();

        // получение информации о классах, методах, полях и аннотациях, в том числе с модификатором доступа "private"
        refGetter.showClass(rabbit);
        // также выводит методы класса "Object", т.к. все классы отнаследованы от "Object"
        refGetter.showMethod(rabbit);
        refGetter.showField(rabbit);
        refGetter.showAnnotation(rabbit);

        // заполнение приватного поля, помеченного соответствующей аннотацией и уже указанным значением в методе "setField()"
        refSetter.setField(rabbit);
        System.out.println(rabbit.getBreed());
        System.out.println(rabbit.getName());

        // создание клона объекта "rabbit"
        Object clone = refCloner.clone(rabbit);
        refGetter.showClass(clone);
    }
}
