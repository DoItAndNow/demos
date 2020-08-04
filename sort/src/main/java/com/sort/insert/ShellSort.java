package com.sort.insert;

import com.sort.Sort;

/**
 * Description: 插入排序-希尔排序
 *
 * @author songcx
 * @date 2020/7/1 18:58
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class ShellSort implements Sort {

    /**
     * Description:希尔排序  每一个子序列排序用了直接插入排序
     * <>
     * @author songcx
     * @date 19:09 2020/7/1
     * @param array 1
     * @return int[]
     **/
    @Override
    public int[] sort(int[] array) {
        double d1 = array.length;
        int temp;
        while (true) {
            d1 = Math.ceil(d1 / 2);
            int d = (int) d1;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < array.length; i += d) {
                    int j = i - d;
                    temp = array[i];
                    for (; j >= 0 && temp < array[j]; j -= d) {
                        array[j + d] = array[j];
                    }
                    array[j + d] = temp;
                }
            }
            if (d == 1){
                break;
            }
        }
        return array;
    }
}
