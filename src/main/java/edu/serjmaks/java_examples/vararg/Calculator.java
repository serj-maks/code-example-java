package edu.serjmaks.java_examples.vararg;

import java.util.Arrays;

public final class Calculator {

    public static int sum(int... nums) {
        return Arrays.stream(nums).sum();
    }

    public static int sum2(int... nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            System.out.println("adding " + nums[i] + ": get " + sum);
        }
        return sum;
    }
}
