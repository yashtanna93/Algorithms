package leetcode.problem2;

import leetcode.ListNode;
import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;


/**
 * @author Yash Tanna
 * @since 4/1/2016
 */
public class TestCase2 {
    @Test
    public void testAddTwoNumber() {
        startTest();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = null;

        ListNode target = new ListNode(1);
        target.next = new ListNode(2);
        target.next.next = new ListNode(3);

        ListNode solution = Problem2AddTwoNumbers.addTwoNumbers(l1, l2);
        while(target!=null) {
            assertEquals(target.val, solution.val);
            target = target.next;
            solution = solution.next;
        }
    }
}
