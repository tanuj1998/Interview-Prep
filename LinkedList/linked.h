class Node {
public:
	int value;
	Node *next;
	Node *prev;
};

class LinkedList {
    public:
	Node * head;
	int length;
};

void init(LinkedList * list);
void add(LinkedList * list, int value);
int findValue(LinkedList * list, int value);
int getValue(LinkedList * list, int index);
void removeElem(LinkedList * list, int value);
void printForward(LinkedList * list);
void printBack(LinkedList * list);
void reverse(LinkedList * list);

