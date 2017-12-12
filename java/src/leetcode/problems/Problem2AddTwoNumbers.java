package leetcode.problems;

import leetcode.ListNode;

/**
 * <h1>Add Two Numers</h1>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * @author Yash Tanna
 * @since 4/1/2017
 */
public class Problem2AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int netSum;
        ListNode head = new ListNode(0);
        ListNode ans = new ListNode(0);

        if(l1!=null&&l2!=null) {
            carry = (l1.val+l2.val)/10;
            netSum = (l1.val+l2.val)%10;
            ans = new ListNode(netSum);
            head = ans;
            l1 = l1.next;
            l2 = l2.next;
        } else if(l2==null) {
            ans = new ListNode(l1.val);
            head = ans;
            l1 = l1.next;
        } else if (l1==null) {
            ans = new ListNode(l2.val);
            head = ans;
            l2 = l2.next;
        }

        while(l1!=null&&l2!=null) {
            netSum = (l1.val+l2.val + carry)%10;
            carry = (l1.val+l2.val + carry)/10;
            ans.next = new ListNode(netSum);
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1!=null) {
            netSum = (l1.val + carry)%10;
            carry = (l1.val + carry)/10;
            ans.next = new ListNode(netSum);
            ans = ans.next;
            l1 = l1.next;
        }

        while(l2!=null) {
            netSum = (l2.val + carry)%10;
            carry = (l2.val + carry)/10;
            ans.next = new ListNode(netSum);
            ans = ans.next;
            l2 = l2.next;
        }

        if(carry==1) {
            ans.next = new ListNode(carry);
        }

        return head;
    }
}
