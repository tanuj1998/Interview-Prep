class LinkedList 
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
    
//Add to front of the list
public void push(int new_data){
	Node new_node = new Node(new_data);
	new_node.next = head;
	head = new_node;
}

//Add after a given node

public void insertAfter(Node prev_node, int new_data){
	if(prev_node == null){
		return;
	}
	Node new_node = new Node(new_data);

	new_node.next = prev_node.next;
	prev_node.next = new_node;
}

//Add at the end

public void append(int new_data){
	Node new_node = new Node(new_data);
	
	if(head == null){
		head = new Node(new_data);
		return;
	}

	new_node.next = null;

	Node last = head;
	while(last != null){
		last = last.next;
	}
	last.next = new_node;
	return;
}