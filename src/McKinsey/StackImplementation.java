package McKinsey;

public class StackImplementation {
	
	int size ;
	int top ;
	int [] stack ;
	
	public StackImplementation(int arraysize){
		size = arraysize ;
		top = -1 ;
		stack = new int [size];
	}
	
	void push(int n){
		if (top == size -1) {
		System.out.println("Stakc full cannot insert");
	}
		else{
			top = top + 1 ;
			stack[top] = n ;
		}
	}
	
	void pop (){
		if (top != -1){
			top = top -1 ;
		}
		else
			System.out.println("Stack is Empty");
	}
		
	public void display(){

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementation newStack = new StackImplementation(5);
        newStack.push(10);
        newStack.push(1);
        newStack.push(50);
        newStack.push(20);
        newStack.push(90);

        newStack.display();
        newStack.pop();
        newStack.display();
        newStack.pop();
        newStack.display();
        newStack.pop();
        newStack.display();
        newStack.pop();
        newStack.display();
	}

}
