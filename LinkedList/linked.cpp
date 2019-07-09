#include <assert.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "LinkedList.h"

void init(LinkedList * list)
{
	list->head = NULL;
	list->length = 0;
}
void add(LinkedList * list, int value) {
    Node *temp = (Node*)malloc(sizeof(Node));
    temp->value = value;
    temp->next = NULL;
    temp->prev = NULL;
    
    if(list->head == NULL){
        list->head = temp;
        return;
    }
    
    Node *last = list->head;
    
    while(last->next != NULL){
        last = last->next;
    }
    
    last->next = temp;
    temp->prev = last;
    list->length++;
}

int findValue(LinkedList * list, int value) {
	Node *temp = list->head;
	while(temp !=NULL){
	if(temp ->value == value){
            return 1;
	}

	temp = temp->next;
	}
        return 0;
}

int getValue(LinkedList * list, int index) {
	
	Node *temp = list->head;
	int b = 0;
	
	while(temp != NULL){
	if(b == index){
        int ans = temp->value;
        return ans;
	}

	b++;
	temp = temp->next;
	}
	//If value doesn't exist
	return 0;
}

void removeElem(LinkedList * list, int value) {
	Node *temp = list->head;
	Node *prev = NULL;
	
	if(temp != NULL && temp->value == value){
	    list->head= temp->next;  
        free(temp);              
        return; 
	}
	
	while(temp != NULL && temp->value != value){
	    prev = temp;
	    temp = temp->next;
	}
	
	if(temp == NULL){
	    printf("Not found");
	}
	
	prev->next = temp->next;
	temp->next->prev = prev;
	list->length--;
	free(temp);
}

int getSize(LinkedList * list) {
	
	return list->length;
}

void reverse(LinkedList * list){
    Node *temp = NULL;  
    Node *current = list->head;  
    while (current != NULL)  {  
        temp = current->prev;
        current->prev = current->next;
        current->next = temp;
        current = current->prev;
    } 
    if(temp != NULL){
        list->head = temp->prev;
    }
}
void printForward(LinkedList * list) {
	if (list->head == NULL) 
	{
		printf("{EMPTY}\n");
		return;
	}
    
    printf("{");

	Node *a = list->head;
	
	while (a != NULL) 
	{
		printf("%d", a->value);
		a = a->next;
		if (a != NULL) 
		{
			printf(", ");
		}
	}

	printf("}\n");
}

void printBack(LinkedList * list){
    if (list->head == NULL) 
	{
		printf("{EMPTY}\n");
		return;
	}
    
    printf("{");

    Node *last = list->head;
    
    while(last->next != NULL){
        last = last->next;
    }
    
	Node *a = last;
	
	while (a != list->head->prev) 
	{
		printf("%d", a->value);
		a = a->prev;
		if (a != NULL) 
		{
			printf(", ");
		}
	}

	printf("}\n");
    
}
int main(int argc, char const *argv[])
{
    LinkedList list;

	init(&list);
	add(&list,1);
	add(&list,2);
	add(&list,3);
	add(&list,4);
	add(&list,5);
	reverse(&list);
	printForward(&list);
	printBack(&list);
	removeElem(&list,3);
	printForward(&list);
	printBack(&list);
}