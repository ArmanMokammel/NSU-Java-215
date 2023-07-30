#include <stdio.h>

typedef struct student
{
    int roll;
    float cgpa;
    char name[20];
    struct student *next;
}Student;

void printList(Student *p)
{
    while(p->next != NULL)
    {
        p = p->next;
        printf("%d, %f, %s\n", p->roll, p->cgpa, p->name);
    }
}

int main()
{
    Student *head;
    Student *temp;
    Student *tail;
    Student s, t;

    head = (Student*)malloc(sizeof(Student));
    head->next = NULL;
    tail = head;

    int n ;

    printf("Enter roll of student: ");
    scanf(" %d", &n);


    while(n != -1)
    {
        temp = (Student*)malloc(sizeof(Student)); //LOOP START
        temp->roll = n ;

        printf("Enter cgpa of student: ");
        scanf(" %f", &temp->cgpa);
        printf("Enter name of student: ");
        scanf(" %[^\n]s", temp->name);
        tail->next = temp;
        temp->next = NULL;
        tail = temp; //LOOP END
        printf("Enter roll of student: ");
        scanf(" %d", &n);
    }

    printList(head);
}
