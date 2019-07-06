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
