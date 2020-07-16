
public class LinkedStack {
	private StackNode top;
	private int size;
	
	public LinkedStack() {
		this.top = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	
	
	public void push(String item) {
		StackNode node = new StackNode();
		node.info = item;
		node.link = top;
		top = node;
		size++;
	}
	public String pop() {
		if(isEmpty()) {
			return null;
		}else {
		StackNode node = top;
		top = node.link;
		size--;
		return node.info;
		}
	}
	public String peek() {
		if(isEmpty()) {
			return null;
		}else {
			return top.info;
		}
	}
	public int size() {
		return size;
	}
}
