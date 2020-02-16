function ListNode(val){
    this.val = val;
    this.next = null;
}
var mergeTwoLists = function(l1, l2) {
    let dummy = new ListNode(0)
    
    let p1 = l1;
    let p2 = l2;
    let newHead = l1 > l2 ? l2 : l1;
    while(p1 && p2){
        if(p1 < p2){
            dummy = p1;
            p1 = p1.next;
        }else {
            dummy = p2;
            p2 = p2.next;
        }
    console.log(dummy.val)
        
        dummy=dummy.next;
        
        
    }
    // newHead.next = dummy;
    
    return newHead;
};

let head1 = new ListNode(1);
let node11 = new ListNode(5);
let node12 = new ListNode(7);

let head2 = new ListNode(2);
let node21 = new ListNode(4);
let node22 = new ListNode(4);

node21.next = node22;
head2.next = node21;

node11.next = node12;
head1.next = node11;

// console.log(head1)
// console.log(head2)
let mergedList = mergeTwoLists(head1, head2);
console.log(mergedList)