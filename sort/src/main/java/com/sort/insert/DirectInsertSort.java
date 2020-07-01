package com.sort.insert;

import com.sort.Sort;

/**
 * Description: 插入排序-直接插入排序
 *
 * @author songcx
 * @date 2020/7/1 18:57
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class DirectInsertSort implements Sort {

    /**
     * Description:直接插入排序
     * <>
     * @author songcx
     * @date 19:09 2020/7/1
     * @param array 1
     * @return int[]
     **/
    @Override
    public int[] sort(int[] array) {

        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            for (; j >= 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }
}
