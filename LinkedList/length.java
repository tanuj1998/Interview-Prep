/*
class Node 
{ 
    int data; 
    Node next; 
    Node(int d)  { data = d;  next = null; } 
} 
*/

public int getCount(){
	Node temp = head;
	int count = 0;

	while(temp != null){
		count++;
		temp = temp.next;
	}
	return count;
}