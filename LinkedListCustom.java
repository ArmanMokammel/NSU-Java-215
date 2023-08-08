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
	 
	 public void remove()
	 {
		 
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
