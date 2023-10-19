package com.ymiir.array.id209;

class MinSubArray{
    // 动态规划写法超出内存限制，因为空间复杂度较高
    public int minSubArrayLen(int target, int[] nums) {
        int[][] temp = new int[nums.length][];
        // 数组计算子序列和
        for(int i=0;i<temp.length;i++){
            temp[i]=new int[nums.length];
        }
        // 初始化dp数组
        for(int i=0;i<temp.length;i++){
            for(int j=i;j<temp[i].length;j++){
                if(i==j){
                    temp[i][j]=nums[i];
                }
            }
        }
        for(int i=0;i<temp.length;i++){
            for(int j=i+1;j<temp[i].length;j++){
                temp[i][j]=temp[i][j-1]+nums[j];
            }
        }
        int min=nums.length+1;
        for(int i=0;i< temp.length;i++){
            for(int j=i;j<temp[i].length;j++){
                if(temp[i][j]>=target && (j-i+1)<min){
                    min=j-i+1;
                }
            }
        }
        if(min==nums.length+1){
            return 0;
        }else {
            return min;
        }
    }
    // 此题正确解法是滑动窗口
    public int minSubArrayLen2(int target, int[] nums){
        int min = nums.length+1;
        int sum =0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while (sum>=target){
                if((i-left+1)<min){
                    min=i-left+1;
                }
                sum=sum-nums[left];
                left++;
            }
        }
        if(min==nums.length+1){
            return 0;
        }
        return min;
    }
}
public class Solution {
    public static void main(String[] args){
        MinSubArray msa=new MinSubArray();
        int[] nums = new int[6];
        nums[0]=2;
        nums[1]=3;
        nums[2]=1;
        nums[3]=2;
        nums[4]=4;
        nums[5]=3;
        System.out.println(msa.minSubArrayLen2(7,nums));
    }
}
