package leetcode.problems;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import leetcode.ListNode;

/**
 * @author Yash Tanna
 * @since 12/10/17
 */
public class TestProblem2AddTwoNumbers {

    Problem2AddTwoNumbers problem2AddTwoNumbers = new Problem2AddTwoNumbers();

    @Test
    public void testAddTwoNumberCase1() {
        startTest();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode target = new ListNode(7);
        target.next = new ListNode(0);
        target.next.next = new ListNode(8);

        ListNode solution = problem2AddTwoNumbers.addTwoNumbers(l1, l2);
        while (target != null) {
            assertEquals(target.val, solution.val);
            target = target.next;
            solution = solution.next;
        }
    }

    @Test
    public void testAddTwoNumberCase2() {
        startTest();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = null;

        ListNode target = new ListNode(1);
        target.next = new ListNode(2);
        target.next.next = new ListNode(3);

        ListNode solution = problem2AddTwoNumbers.addTwoNumbers(l1, l2);
        while (target != null) {
            assertEquals(target.val, solution.val);
            target = target.next;
            solution = solution.next;
        }
    }

    @Test
    public void testAddTwoNumberCase3() {
        startTest();

        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);

        ListNode l2 = new ListNode(1);

        ListNode target = new ListNode(0);
        target.next = new ListNode(0);
        target.next.next = new ListNode(1);

        ListNode solution = problem2AddTwoNumbers.addTwoNumbers(l1, l2);
        while (target != null) {
            assertEquals(target.val, solution.val);
            target = target.next;
            solution = solution.next;
        }
    }

    @Test
    public void testAddTwoNumberCase4() {
        startTest();

        ListNode l2 = new ListNode(1);

        ListNode target = new ListNode(1);

        ListNode solution = problem2AddTwoNumbers.addTwoNumbers(null, l2);
        while (target != null) {
            assertEquals(target.val, solution.val);
            target = target.next;
            solution = solution.next;
        }
    }

    @Test
    public void testAddTwoNumberCase5() {
        startTest();

        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(3);
        l2.next.next.next = new ListNode(3);

        ListNode target = new ListNode(7);
        target.next = new ListNode(0);
        target.next.next = new ListNode(8);
        target.next.next.next = new ListNode(3);

        ListNode solution = problem2AddTwoNumbers.addTwoNumbers(l1, l2);
        while (target != null) {
            assertEquals(target.val, solution.val);
            target = target.next;
            solution = solution.next;
        }
    }
}
