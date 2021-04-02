/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    //Reversing iteratively
/*  var arr = [];
    var temp = head;
    while (temp != null){
        arr.unshift(temp.val);
        temp = temp.next;
    }
    
    var temp = head;
    head = temp;
    var i = 0;
    while(temp != null){
        temp.val = arr[i];
        i++;
        temp = temp.next;
    }
    return head;
 */
    
    //iterative approach (shorter method)
  /*  var curr = head;
    var prev = null;
    while (curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
  */
    
    //Recursive approach
    if (head==null || head.next == null) return head;
    var p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return p;
    
};