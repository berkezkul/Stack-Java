public class StackOperations {

    static Stack newStack = new Stack(12);
    static Stack temp = new Stack(9);


    public static void findMin(Stack newStack){
        int min = newStack.peek();
        Stack temp = new Stack(newStack.size());

        while(!newStack.isEmpty()){
            if(newStack.peek() < min) {
                min = newStack.peek();
            }
            temp.push(newStack.pop());
        }

        while(!temp.isEmpty()){
            if(temp.peek() != min){
                newStack.push(temp.pop());
            }else{
                temp.pop();
            }
        }




    }

    public static Stack sortStack(Stack stk) {
        while (!stk.isEmpty()) {
            int tmp = stk.peek();
            stk.pop();

            while (!temp.isEmpty() && temp.peek() > tmp) {
                stk.push(temp.peek());
                temp.pop();

            }
            temp.push(tmp);
        }
        return temp;
    }



    public static Stack merge(Stack s1, Stack s2){
        while (!s1.isEmpty()) {
            newStack.push(s1.peek());
            s1.pop();
        }

        while (!s2.isEmpty()) {
            newStack.push(s2.peek());
            s2.pop();
        }
        return newStack;
    }


    public static void main(String[] args) {


        Stack myStack = new Stack(5);
        myStack.push(8);
        myStack.push(2);
        myStack.push(7);
        myStack.push(5);


        Stack myStack2 = new Stack(7);
        myStack2.push(10);
        myStack2.push(6);
        myStack2.push(7);
        myStack2.push(1);


        myStack.display();
        System.out.println("---------------");
        findMin(myStack);
        myStack.display();
        System.out.println("-----------------");


        sortStack(merge(myStack,myStack2)).display();


    }

}
