
public class Stack {
	private int top;
	private String[] elements;
	private int capasity=6;
	
	
	
	public Stack(){
		elements=new String[capasity];
		top=-1;
	}
	public void push(String Choose){
		if(isFull())
			System.out.print("");
		else{
		top++;
		elements[top]=Choose;
		}
	}
	
	public String pop(){
		if(isEmpty()){
			return "";
		}
		else{
		String retData=elements[top];
		top--;
		return retData;
		}
	}
	
	public String peek(){
		if(isEmpty()){
			return null;
		}
		else
		return elements[top];
		
	}
	
	public int getTop() {
		return top;
	}

	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		return (top+1==elements.length);
	}
	
	public int size(){
		return top+1;
	}
	
}
