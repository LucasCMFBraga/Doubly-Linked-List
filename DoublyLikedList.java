
public class DoublyLikedList{
	Node head;
	Node tail;
	int size;
	
	public DoublyLikedList(){
		head=null;
		tail=null;
		size=0;
	}
	
	public void insertHead(String url){
		Node tempnode=new Node();
		tempnode.setValue(url);
		
		
		if(head==null && tail==null){
			head=tempnode;
			tail=tempnode;
		
		}else {
			head.setPreviousNode(tempnode);
			tempnode.setNextNode(head);
			head=tempnode;
		}
		size++;
		
	}
	
	public void insertTail(String url){
		Node tempnode=new Node();
		tempnode.setValue(url);
		
		if(head==null && tail==null){
			head=tempnode;
			tail=tempnode;
		
		}else {
			tail.setNextNode(tempnode);
			tempnode.setPreviousNode(tail);
			tail=tempnode;
		}
		
		size++;
		
	}
	
	public void showHtoT() {
		System.out.println("List content:");
	    Node node = head;

	    while(node != null){
	      System.out.println(node.getValue());
	      node = node.getNextNode();
	    }
	    
	}
	
    public void showTtoH(){
		System.out.println("List content:");
	    Node node = tail;

	    while(node != null){
	      System.out.println(node.getValue());
	      node = node.getPreviousNode();
	    } 
	}
	
    public Node getHead (){
    	Node head_temp=head;
    	return head_temp;
    }
    
    public Node getTail (){
    	Node tail_temp=tail;
    	return tail_temp;
    }


}
