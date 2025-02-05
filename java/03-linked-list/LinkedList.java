
public class LinkedList{

    ListNode head;
    private int length;

    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }

    public LinkedList(){
        length = 0;
    }
    
    public ListNode getHead(){
        return head;
    }

    public void insertAtBeginning(ListNode node){
        node.next = head;
        head = node;
        length++;
    }
    
    public void insertAtEnd(ListNode node){
        if(head == null){
            head = node;
        }
        else{
            ListNode current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
            node.next = null;
        }
        length++;
    }
    
    // Add a new value to the list at a given position. All values at that position to the end move over to make room.
    public void insertAtPosition(int data, int position){
        // fix the position
        if (position < 0)
            position = 0;
        if (position > length) 
            position = length;
        if (head == null)
            head = new ListNode(data);
        // if adding at the front of the list... 
        else if (position == 0) {
            ListNode temp = new ListNode(data);
            temp.next = head;
            head = temp;
        }
        else{
            ListNode current = head;
            for(int i=1;i<position;i++){
                current = current.next;
            }
            ListNode newNode = new ListNode(data);
            newNode.next = current.next;
            curr.next = newNode
        }
        length++;
    }

    public ListNode removeFromBeginning(){
        ListNode current = head;
        if(curr!=null){
            head = current.next;
        }
        return current;
    }

    public void ListNode removeFromEnd(){
        if(head==null)
            return null;

        ListNode current = head, previous, nxt;
        current = head;
        nxt = current.next;

        if(nxt == null){
            head = null;
            return current
        }

        while(nxt = current.next!=null){
            previous = current;
            current = current.next;
        }
        
        previous.next = null;
        return current;

    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.insertAtBeginning(new ListNode(1));

    }
}