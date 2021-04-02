/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
  /*  // change content method
    while (head != null){
        if (head.val == 'a') return true;
        if (head.val!='a') head.val = 'a';
        head = head.next;
    }
    return false;
  */ 
   
    //Fast pointer and Slow pointer method
    var slow = head; var fast = head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return true;
    }
    return false;
    
};