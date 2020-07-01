package com.sort.select;

import com.sort.Sort;

/**
 * Description: 选择排序-简单选择排序
 *
 * @author songcx
 * @date 2020/7/1 18:59
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class SimpleSelectSort implements Sort {

    /**
     * Description:简单选择排序
     * <>
     * @author songcx
     * @date 19:09 2020/7/1
     * @param array 1
     * @return int[]
     **/
    @Override
    public int[] sort(int[] array) {
        int position;
        for (int i = 0; i < array.length; i++) {
            position = i;
            int temp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
