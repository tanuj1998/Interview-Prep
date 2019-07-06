/*class LinkedList 
{ 
    Node head; // head of list 
  
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
*/

//Deleting a given key

public void delete(int key){
	Node temp = head;
	Node prev = null;

	//head is the key
	if(temp != null && temp.data == key){
		head = temp.next;
		return;
	}

	while(temp != null && temp.data != key){
		prev = temp;
		temp = temp.next;
	}

	if(temp == null){
		return;
	}

	prev.next = temp.next;
}
