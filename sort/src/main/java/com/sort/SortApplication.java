package com.sort;

import com.sort.baseNumber.BaseNumberSort;
import com.sort.insert.DirectInsertSort;
import com.sort.insert.ShellSort;
import com.sort.merge.MergeSort;
import com.sort.select.HeapSort;
import com.sort.select.SimpleSelectSort;
import com.sort.swap.FastSort;

/**
 * Description: 排序模块主方法
 *
 * @author songcx
 * @date 2020/7/1 19:05
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class SortApplication {

    public static void main(String[] args) {
        int[] array = {34, 18, 54, 5, 4, 69, 99, 98, 54, 56,77,25,33,35,49,72,81,64,36,108};
        Sort instance = new FastSort();
        instance.sort(array);
        SortApplication.printData(array);

    }

    private static void printData(int[] array) {
        //输出排列好的数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

}
