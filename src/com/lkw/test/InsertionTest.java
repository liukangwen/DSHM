package com.lkw.test;

import com.lkw.sort.Insertion;

import java.util.Arrays;

/**
 * Created by crystal on 05/17/2021 8:04 AM
 */
public class InsertionTest {

    public static void main(String[] args) {
        Integer[] a = {4,3,2,10,12,1,5,6};

        Insertion.sort(a);

        System.out.println(Arrays.toString(a));//{1,2,3,4,5,6,10,12}

    }
}
