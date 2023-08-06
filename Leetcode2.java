public class Leetcode2 {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans=new ListNode();
        ListNode temp=ans;

        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            sum+=carry;
            carry=sum/10;
            ListNode cur=new ListNode(sum%10);
            temp.next=cur;
            temp=temp.next;
        }
        return ans.next;
        
    }
}


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         if(l1 == null) return l2;
//         if(l2 == null) return l1;
//         int carry = 0;
//         ListNode head = null;
//         while(l1 != null && l2 != null){
//             int sum = l1.val + l2.val + carry;
//             ListNode t1 = new ListNode(sum%10);
//             t1.next = head;
//             head = t1;
//             carry = sum/10;
//             l1 = l1.next;
//             l2 = l2.next;
//         }
//         while(l1!= null){
//             int sum = l1.val + carry;
//             ListNode t1 = new ListNode(sum%10);
//             t1.next = head;
//             head = t1;
//             carry = sum/10;
//             l1 = l1.next;
//         }
//         while(l2 != null){
//             int sum = l2.val + carry;
//             ListNode t1 = new ListNode(sum%10);
//             t1.next = head;
//             head = t1;
//             carry = sum/10;
//             l2 = l2.next;
//         }
//         if(carry>0){
//             ListNode t1 = new ListNode(carry);
//             t1.next = head;
//             head = t1;
//         }
//         ListNode prev = null;
//         ListNode curr = head;
//         while(curr!= null){
//             ListNode t1 = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = t1;
//         }
//         return head;
//     }
// }
}
