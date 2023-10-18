package com.ymiir.array.id027;

import org.jetbrains.annotations.NotNull;

class Solution{
    // 双指针
    public int removeElement(@org.jetbrains.annotations.NotNull int @NotNull [] nums, int val){
        int s = 0;
        int q = 0;
        for(;q<nums.length;q++){
            if(nums[q]==val){
               continue;
            }
            nums[s]=nums[q];
            s++;
        }
        return s;
    }
}
public class RemoveEle {
    public static void main(String[] args){
        int[] nums = new int[10];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 2;
        nums[5] = 3;
        nums[6] = 4;
        nums[7] = 5;
        nums[8] = 6;
        nums[9] = 7;
        Solution s = new Solution();
        int len = s.removeElement(nums,1);
        for(int i=0;i<len;i++){
            System.out.println(nums[i]);
        }
    }
}
