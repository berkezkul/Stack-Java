public class Stack {
    private int top;
    private int[] items;

    public Stack(int size){
        this.items=new int[size];
        this.top=-1;

    }
    public boolean isEmpty(){
        return this.top==-1;
    }
    public boolean isFull(){
        return this.top==this.items.length-1;
    }
    public int count(){
        return this.top+1;
    }
    public int size(){
        return this.items.length;
    }
    public int peek(){
        return this.items[this.top];
    }
    public int push(int val){
        if(isFull()){
            System.out.println("stack is full");
        }else{
            this.top++;
            this.items[this.top]=val;
        }
        return val;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }else{
            this.top--;
            return this.items[this.top+1];
        }
    }


    public static Stack copyStack(Stack stk, Stack stk2){
        Stack newStack = new Stack(stk.size()+stk.size());
        Stack temp = new Stack(stk.size()+ stk2.size());
        while(!temp.isEmpty()){
            int popped = temp.pop();
            newStack.push(popped);
            stk.push(popped);
        }
        return newStack;
    }


    public void display(){
        if(isEmpty())
            System.out.println("stack is empty");
        else{
            for (int i = this.top; i >=0 ; i--) {
                System.out.println(this.items[i]);
            }
        }
    }
}
