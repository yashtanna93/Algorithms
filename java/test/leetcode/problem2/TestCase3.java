package leetcode.problem2;

import leetcode.ListNode;
import org.junit.Test;

import static leetcode.TestPrinter.startTest;
import static org.junit.Assert.assertEquals;


/**
 * @author Yash Tanna
 * @since 4/1/2016
 */
public class TestCase3 {
    @Test
    public void testAddTwoNumber() {
        startTest();

        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);

        ListNode l2 = new ListNode(1);

        ListNode target = new ListNode(0);
        target.next = new ListNode(0);
        target.next.next = new ListNode(1);

        ListNode solution = Problem2AddTwoNumbers.addTwoNumbers(l1, l2);
        while(target!=null) {
            assertEquals(target.val, solution.val);
            target = target.next;
            solution = solution.next;
        }
    }
}
