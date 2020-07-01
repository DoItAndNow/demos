package com.sort.baseNumber;

import com.sort.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 基数排序
 *
 * @author songcx
 * @date 2020/7/1 19:00
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class BaseNumberSort implements Sort {

    /**
     * Description:基数排序实现方法
     * <>
     * @author songcx
     * @date 19:07 2020/7/1
     * @param array 1
     * @return int[]
     **/
    @Override
    public int[] sort(int[] array) {
        baseNumberSort(array);
        return array;
    }

    private void baseNumberSort(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int time = 0;
        while (max > 0) {
            max /= 10;
            time++;
        }

        List<ArrayList> queue = new ArrayList<ArrayList>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> queue1 = new ArrayList<Integer>();
            queue.add(queue1);
        }

        for (int i = 0; i < time; i++) {
            for (int j = 0; j < array.length; j++) {
                int x = array[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
                ArrayList<Integer> queue2 = queue.get(x);
                queue2.add(array[j]);
                queue.set(x, queue2);
            }
            int count = 0;
            for (int k = 0; k < 10; k++) {
                while (queue.get(k).size() > 0) {
                    ArrayList<Integer> queue3 = queue.get(k);
                    array[count] = queue3.get(0);
                    queue3.remove(0);
                    count++;
                }
            }
        }
    }
}
