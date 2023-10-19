package com.ymiir.array.id977;

class Array2Sort{
    public int[] sortedSquares(int[] nums){
        // 双指针法
        int[] result = new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int k = nums.length-1;
        while(left<=right){
            if(nums[left]*nums[left] > nums[right]*nums[right]){
                result[k]=nums[left]*nums[left];
                k--;
                left++;
            }else {
                result[k]=nums[right]*nums[right];
                k--;
                right--;
            }
        }
        return result;
    }
}
public class Solution {
    public static void main(String []args){
        Array2Sort a2s = new Array2Sort();
        int[] nums = new int[10];
        nums[0]=-7;
        nums[1]=-5;
        nums[2]=-2;
        nums[3]=-1;
        nums[4]=0;
        nums[5]=3;
        nums[6]=4;
        nums[7]=5;
        nums[8]=6;
        nums[9]=9;
        int[] result = a2s.sortedSquares(nums);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }


}
