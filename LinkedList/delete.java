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

//Deleting key at given position

public void delete(int position){
	Node temp = head;

	if(head == null){
		return;
	}
	if(position == 0){
		head = temp.next;
		return;
	}

	for(int i = 0; temp != null && i < position-1; i++){
		temp = temp.next;
	}

	if(temp == null || temp.next == null){
		return;
	}

	Node next = temp.next.next;
	temp.next = next;

}