package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkArray {
    private ArrayList<Number> nums;

    public WorkArray(ArrayList<Number> nums) {
        this.nums = nums;
    }

    public WorkArray(Number [] nums) {
        this(new ArrayList<>(Arrays.asList(nums)));
    }

    public double sum () {
        int sum = 0;
        for (Number number : nums) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
