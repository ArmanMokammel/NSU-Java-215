#include <stdio.h>
#include <stdlib.h>

typedef struct student
{
    int roll;
    float cgpa;
    char name[25];
    struct student *next;
}Student;

void printList(Student *p)
{
    while(p->next != NULL) //If a node is found which has a next value of NULL (not pointing to anything) the loop will stop
    {
        p = p->next; //Getting the next node
        printf("%d, %f, %s\n", p->roll, p->cgpa, p->name);
    }
}

int main()
{
    Student *head, *temp, *tail;

    head = (Student*)malloc(sizeof(Student)); //Initialise head
    head->next = NULL; //set next of head to NULL (not pointing to anything)
    tail = head; //Tail now points to head

    /******* Taking Input *******/
    int n ;
    printf("Enter roll of student: ");
    scanf(" %d", &n);


    while(n != -1) //Input will stop if -1 is entered as roll number
    {
        temp = (Student*)malloc(sizeof(Student)); //Initialise temp
        temp->roll = n;

        printf("Enter cgpa of student: ");
        scanf(" %f", &temp->cgpa);
        printf("Enter name of student: ");
        scanf(" %[^\n]s", temp->name);
        tail->next = temp; //set the next of whatever node tail is pointing to address of temp
        temp->next = NULL; //set the next of temp to NULL (not pointing to anything)
        tail = temp; //Tail now points to temp
        printf("Enter roll of student: ");
        scanf(" %d", &n);
    }

    printList(head);
}
