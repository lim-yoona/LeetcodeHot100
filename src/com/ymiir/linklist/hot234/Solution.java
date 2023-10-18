package com.ymiir.linklist.hot234;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val  = val;
        this.next = next;
    }
}

public class Solution{
    static boolean isPalindrome(ListNode head){
        if(head==null){
            return true;
        }
        ListNode p = head;
        int i = 0;
        while (p != null){
            i++;
            p = p.next;
        }
        System.out.printf("i=%d",i);
        int[] array = new int[i/2];
        p=head;
        for(int j=0;j<i/2;j++){
            array[j]=p.val;
            p=p.next;
        }
        if(i%2==1){
            p=p.next;
        }
        int k=i/2-1;
        while(p!=null){
            if(p.val!=array[k]){
                return false;
            }
            p=p.next;
            k--;
        }
        if(k>=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        ListNode p=new ListNode(8);
        ListNode h=new ListNode(7,p);
        h=new ListNode(6,h);
        h=new ListNode(3,h);
        h=new ListNode(7,h);
        h=new ListNode(8,h);
        ListNode ptr=h;
        while(ptr!=null){
            System.out.println(ptr.val);
            ptr=ptr.next;
        }
        System.out.println(isPalindrome(h));
    }
}