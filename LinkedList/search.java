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

class LinkedList{
	Node head;
	
public boolean search(Node head, int key){
	Node temp = head;
	while(temp != null){
		if(temp.data == key){
			return true;
		}
		temp = temp.next;
	}
	return false;
}
}