package com.sort;

import com.sort.insert.DirectInsertSort;
import com.sort.insert.ShellSort;
import com.sort.merge.MergeSort;
import com.sort.select.HeapSort;
import com.sort.swap.QuickSort;

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
//        int[] array = {34, 18, 54, 5, 4, 69, 99, 98, 54, 56,77,25,33,35,49,72,81,64,36,108};
//        Sort instance = new HeapSort();
//        instance.sort(array);
//        SortApplication.printData(array);

        String test = "data:image/jpeg;base64,322222222222";
        System.out.println(test);
        System.out.println(test.substring(test.lastIndexOf(",") + 1));

    }

    private static void printData(int[] array) {
        //输出排列好的数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

}
