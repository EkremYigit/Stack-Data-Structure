
public class Test {

	public static void main(String[] args) {
		int number=(int)(Math.random()*3+1);
		String Choose="";
		int User=1;
		boolean Winner=false;
		boolean Tie=false;
		Stack s1=new Stack(); Stack s2=new Stack(); Stack s3=new Stack(); 
		Stack fake1=new Stack(); Stack fake2=new Stack(); Stack fake3=new Stack();
		Stack control1=new Stack();  Stack control2=new Stack(); Stack control3=new Stack();
		
		
		
		
			
		do
		{
			User=(((User+1)%2)+1); // sadece 1 ve 2 olmasýný istiyoruz
			number=(int)(Math.random()*6);
			
			
			if(number%2==1){ 
				Choose="O";
			}
				else
				{
					Choose="S";
				}
		if(!(s1.isFull()) || !(s2.isFull()) || !(s3.isFull())|| Tie || Winner){
			if(Winner)
				break;
			if(number<=1 && !(s1.isFull())){
				fake1.push(Choose);
			}
			if(number==2 || number ==3 && !(s2.isFull())){// 2 3 
				fake2.push(Choose);
			}
			if(number >3 && !(s3.isFull())){
				fake3.push(Choose);
			}
		
			if(Winner)
				break;
		
			
			while(!fake1.isEmpty()){ 
				s1.push(fake1.pop());
			}
			while(!s1.isEmpty()){ 
				fake1.push(s1.pop());
			}
			System.out.println("User: "+User);
			System.out.println("");
			System.out.print("S1 | ");
			while(!fake1.isEmpty()){ 
				s1.push(fake1.pop());
				System.out.print(s1.peek()+" | ");
				
			}
		
			System.out.println("");
		
		
			while(!fake2.isEmpty()){ 
				s2.push(fake2.pop());
			}
			while(!s2.isEmpty()){ 
				fake2.push(s2.pop());
			}
			System.out.print("S2 | ");
			while(!fake2.isEmpty()){ 
				s2.push(fake2.pop());
				System.out.print(s2.peek()+" | ");
				
			}
			System.out.println("");

			
			
			while(!fake3.isEmpty()){ 
				s3.push(fake3.pop());
			}
			while(!s3.isEmpty()){ 
				fake3.push(s3.pop());
			}
			System.out.print("S3 | ");
			while(!fake3.isEmpty()){ 
				s3.push(fake3.pop());
				System.out.print(s3.peek()+" | ");
				
			}			
			
			System.out.println("");
			System.out.println("");

			int minNumber1=Math.min(s1.size()-1, s2.size()-1);
			int minNumber=Math.min(minNumber1,s3.size()-1);

			while(s1.size()-1>minNumber){
				fake1.push(s1.pop());
			}
			
			while(s2.size()-1>minNumber){
				fake2.push(s2.pop());
			}
			
			while(s3.size()-1>minNumber){
				fake3.push(s3.pop());
			}
			
			if(s1.peek()=="S" && s2.peek()=="O" && s3.peek()=="S" ){
				Winner=true;
				System.out.println("User"+User+" :Winner");
			}
	
			while(!fake1.isEmpty()){
				s1.push(fake1.pop());
			}
			while(!fake1.isEmpty()){
				s2.push(fake2.pop());
			}
			while(!fake3.isEmpty()){
				s3.push(fake3.pop());
			}
			
			
			
			if(s1.size()>=3 && !Winner){
				fake1.push(s1.pop());
				control1.push(fake1.peek());
				fake1.push(s1.pop());
				control2.push(fake1.peek());
				fake1.push(s1.pop());
				control3.push(fake1.peek());
				if(control1.peek()==control3.peek() && control2.peek()!=control1.peek() && control1.peek()=="S"){
					Winner=true;
					System.out.println("User"+User+" : Winner");
					break;
				}
				else{
					s1.push(fake1.pop());
					s1.push(fake1.pop());
					s1.push(fake1.pop());
					control1.pop();
					control2.pop();
					control3.pop();
				}
				
			}
			if(s2.size()>=3&& !Winner){
				fake2.push(s2.pop());
				control1.push(fake2.peek());
				fake2.push(s2.pop());
				control2.push(fake2.peek());
				fake2.push(s2.pop());
				control3.push(fake2.peek());
				if(control1.peek()==control3.peek() && control2.peek()!=control1.peek() && control1.peek()=="S"){
					Winner=true;
					System.out.println("User"+User+" : Winner");
					break;
				}
				else{
					s2.push(fake2.pop());
					s2.push(fake2.pop());
					s2.push(fake2.pop());
					control1.pop();
					control2.pop();
					control3.pop();
				}
				
			}
			if(s3.size()>=3 && !Winner){
				fake3.push(s3.pop());
				control1.push(fake3.peek());
				fake3.push(s3.pop());
				control2.push(fake3.peek());
				fake3.push(s3.pop());
				control3.push(fake3.peek());
				if(control1.peek()==control3.peek() && control2.peek()!=control1.peek() && control1.peek()=="S"){
					Winner=true;
					System.out.println("User"+User+" : Winner");
					break;
				}
				else{
					s3.push(fake3.pop());
					s3.push(fake3.pop());
					s3.push(fake3.pop());
					control1.pop();
					control2.pop();
					control3.pop();
				}
				
			}
			
			if((s1.isFull()) && s2.isFull() && (s3.isFull())){
				Tie=true;
				break;
			}
			

			if(Winner || Tie)
				break;
			
		User++;	
		}
		
			
	
		
		}while(Winner!=true || Tie != true);
		
		if(Winner){
			System.out.println("");
		}
		else if(Tie){
			System.out.println("Tie!");
		}
		
		
		
	}
}
	




