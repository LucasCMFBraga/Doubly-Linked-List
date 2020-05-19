
public class Node{
 
	private String url;
	private Node nextnode;
	private Node previousnode;
	
	
	public Node (){
		url="";
		nextnode=null;
		previousnode=null;
	}

	public void setValue(String url){
		this.url=url;
	}
	
	public String getValue(){
		return url;
	}
	
	public void setNextNode(Node tempNode){
		nextnode=tempNode;
	}
	
	
	public Node getNextNode(){
		return nextnode;
	}
	
	public Node getPreviousNode (){
		return previousnode;
	}
	
	public void setPreviousNode(Node tempoNode){
		previousnode=tempoNode;
	}
}



