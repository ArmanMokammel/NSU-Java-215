public class LinkedListCustom{
	 public Node head = null;    
	 public Node tail = null;
	 
	 public void add(String data)
	 {
		 Node newNode = new Node(data);
		 
		 if(head == null) 
		 {    
			 head = newNode;    
	         tail = newNode;    
	     }    
	     else 
	     {    
	         tail.next = newNode;    
	         tail = newNode;    
	     }    
	 }
	 
	 public void add(int index, String data)
	 {
		 Node newNode = new Node(data);
		 Node temp = head;
		 
		 for(int i = 0; i < index - 1; i++)
		 {
			 temp = temp.next;
		 }
		 
		 newNode.next = temp.next;
		 temp.next = newNode;
	 }
	 
	 public void remove(String data)
	 {
		 Node temp = head;
		 while(temp.next != null)
		 {
			 if(temp.next.data == data)
			 {
				 temp.next = temp.next.next;
			 }
			 temp = temp.next;
		 }
	 }
	 
	 public void remove(int index)
	 {
		 Node temp = head;
		 
		 for(int i = 0; i < index - 1; i++)
		 {
			 temp = temp.next;
		 }
		 temp.next = temp.next.next;
	 }
	 
	 public void addFirst(String data)
	 {
		 Node newNode = new Node(data);
		 newNode.next = head;
		 head = newNode;
	 }
	 
	 public void addLast(String data)
	 {
		 Node newNode = new Node(data);
		 tail.next = newNode;
		 tail = newNode;
	 }
	 
	 public String toString() {
		 String str = "[";
        Node current = head;    
            
        if(head == null) {    
            return "List is empty";    
        }    
        while(current != null) {    
            str = str + current.data + ", ";    
            current = current.next;    
        } 
        str = str + "]";
        return str;
    }
}
