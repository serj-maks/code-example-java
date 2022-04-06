package com.vault.io_api.directorywalkerv2;

import java.util.Arrays;
import java.util.Collection;

// данный объект участвует в методе "toString" вложенного(nested) класса "TreeInfo" класса "Directory"
public class CustomPrint {
    public static String pformat(Collection<?> c) {
        if (c.size() == 0) {
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        for (Object elem : c) {
            if (c.size() != 1) {
                result.append("\n  ");
                result.append(elem);
            }
        }
        if (c.size() != 1) {
            result.append("\n");
            result.append("]");
        }
        return result.toString();
    }

    public static void customPrint(Collection<?> c) {
        System.out.println(pformat(c));
    }

    public static void customPrint(Object[] c) {
        System.out.println(pformat(Arrays.asList(c)));
    }

}
