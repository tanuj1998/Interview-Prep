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

class LinkedList 
{ 
    Node head;
public int getNth(int index){
	int count = 0;
	Node temp = head;
	while(temp != null){
		if(count == index){
			return temp.data;
		}
		count++;
		temp = temp.next;
	}
	return 0;
	}
}