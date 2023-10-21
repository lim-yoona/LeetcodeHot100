package com.ymiir.linklist.id203;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class DeleteEle{
    // 添加一个sb节点
    public ListNode removeElements(ListNode head, int val) {
        ListNode first = new ListNode(0, head);
        ListNode p = first;
        ListNode q = head;
        while(q!=null){
            if(q.val==val){
                p.next=q.next;
            }else{
                p=q;
            }
            q=q.next;
        }
        return first.next;
    }
    // 不加虚拟节点
    public ListNode removeElements2(ListNode head,int val){
        while(head!=null && head.val==val){
            head=head.next;
        }
        if(head==null){
            return head;
        }
        ListNode p=head;
        ListNode q=p.next;
        while (q!=null){
            if(q.val==val){
                p.next=q.next;
            }else{
                p=q;
            }
            q=q.next;
        }
        return head;
    }
}
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head = new ListNode(2, head);
        head = new ListNode(3, head);
        head = new ListNode(5, head);
        head = new ListNode(1, head);
        head = new ListNode(6, head);
        head = new ListNode(0, head);
        head = new ListNode(9, head);
        head = new ListNode(2, head);
        head = new ListNode(2, head);
        head = new ListNode(2, head);
        DeleteEle de = new DeleteEle();
        ListNode result = de.removeElements2(head, 2);
        ListNode p = result;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
