package com.sort.select;

import com.sort.Sort;

/**
 * Description: 选择排序-堆排序
 *
 * @author songcx
 * @date 2020/7/1 18:59
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class HeapSort implements Sort {

    /**
     * Description:堆排序 不稳定 辅助空间为O(1)， 最坏时间复杂度为O(nlog2n)  平均性能接近最坏性能
     * <>
     * @author songcx
     * @date 19:09 2020/7/1
     * @param array 1
     * @return int[]
     **/
    @Override
    public int[] sort(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            buildMaxHeap(array, arrayLength - 1 - i);
            //每次构建完大顶堆，数组的第一个元素必定是当前大顶堆的最大元素，交换到末尾 进入有序区
            swap(array, 0, arrayLength - 1 - i);
        }
        return array;
    }

    private  void buildMaxHeap(int[] data, int lastIndex) {
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            //k保存当前判断的节点
            int k = i;
            //k * 2 + 1 为其左子节点
            while (k * 2 + 1 <= lastIndex) {
                //biggerIndex为其左子节点下标
                int biggerIndex = 2 * k + 1;
                //判断右子节点是否存在
                if (biggerIndex < lastIndex) {
                    //如果右子节点存在且左子节点小于右子节点  下标改为右子节点下标
                    if (data[biggerIndex] < data[biggerIndex + 1]) {
                        biggerIndex++;
                    }
                }
                //如果节点小于其比较大的子节点 交换节点和其比较大的子节点  然后处理交换后的子树
                if (data[k] < data[biggerIndex]) {
                    swap(data, k, biggerIndex);
                    k = biggerIndex;
                } else {
                    break;
                }
            }
        }
    }

    private  void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
