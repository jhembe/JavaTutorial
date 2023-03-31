class StackOverFlow extends Exception{
    public String toString(){
        return "Stack is Full";
    }
}

class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack is Empty";
    }
}

class Stack{
    private int size;
    private int top=-1;
    private int[] s;

    //let's create our stack constructor
    public Stack(int sz){
        this.size = sz;
        s = new int[sz];
    }

    // now for the stack methods
    public void push(int x) throws StackOverFlow{
        if(top == size-1){
            throw new StackOverFlow();
        }
        else{
            top++;
            s[top] = x;
        }
    }
    public int pop() throws StackUnderFlow{
        int x = -1;
        if(top == -1){
            throw new StackUnderFlow();
        }
        else{
            x=s[top];
            top--;
            return x;
        }
    }

    public void display()throws StackUnderFlow{
        int temp = top;
        if(top == -1){
            throw new StackUnderFlow();
        }
        else{
            while (temp != -1){
                System.out.println(s[temp]);
                temp--;
            }
        }
    }
}

public class StackChallenge {
    public static void main(String[] args) {
        Stack sc = new Stack(5);
        try{
            sc.push(2);
            sc.push(6);
            sc.push(10);
            sc.push(45);
            sc.push(22);
            sc.push(453);
        }
        catch (StackOverFlow e){
            System.out.println(e.toString());
        }
        // Let's view them
        try {
            sc.pop();
            sc.display();
        }
        catch (StackUnderFlow e){
            System.out.println(e.toString());
        }


    }
}
