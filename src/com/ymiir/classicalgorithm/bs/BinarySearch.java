package com.ymiir.classicalgorithm.bs;

import java.util.ArrayList;

public class BinarySearch {
    // 递归实现
    static int binarySearch(int[] array,int start,int end,int key){
        if(start>end){
            return -1;
        }
        // 为防止溢出，应该按这样写
        // int mid =  start + (end-start)/2;
        int mid = (start+end)/2;
        if(array[mid]==key){
            return mid;
        }else if(array[mid]<key){
            return binarySearch(array,mid+1,end,key);
        }else{
            return binarySearch(array,start,mid-1,key);
        }
    }
    // 非递归实现
    static int binarySearch2(int[] array,int start,int end,int key){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid]==key){
                return mid;
            }else if(array[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int[] array = new int[10];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=5;
        array[4]=6;
        array[5]=7;
        array[6]=8;
        array[7]=10;
        array[8]=11;
        array[9]=13;
        System.out.println(binarySearch2(array,0,9,13));
    }
}
