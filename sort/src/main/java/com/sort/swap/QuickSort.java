package com.sort.swap;

import com.sort.Sort;

/**
 * Description: 交换排序-快速排序
 *
 * @author songcx
 * @date 2020/7/1 18:56
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class QuickSort implements Sort {

    /**
     * Description:快速排序
     * <>
     * @author songcx
     * @date 19:09 2020/7/1
     * @param array 1
     * @return int[]
     **/
    @Override
    public int[] sort(int[] array) {
        quick(array);
        return array;
    }

    private int getMiddle(int[] list, int low, int high) {
        int tmp = list[low];    
        while (low < high) {
            while (low < high && list[high] >= tmp) {
                high--;
            }
            list[low] = list[high];  
            while (low < high && list[low] <= tmp) {
                low++;
            }
            list[high] = list[low];   
        }
        list[low] = tmp;              
        return low;                   
    }

    private  void quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);  
            quickSort(list, low, middle - 1);        
            quickSort(list, middle + 1, high);      
        }
    }

    private  void quick(int[] a2) {
        if (a2.length > 0) {    
            quickSort(a2, 0, a2.length - 1);
        }
    }
}
