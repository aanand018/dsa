package BinaryTreeImplementations;

public class CustomStack {

    protected int[] data;

    int ptr=-1;

    public static final int DEFAULT_STACK_SIZE =10;

    public CustomStack(int size){
        this.data=new int[size];
    }
    public CustomStack(){
        this.data=new int[DEFAULT_STACK_SIZE];
    }

    public boolean push(int obj)  throws Exception{

        if(isFull())
        {

            throw new Exception("stack overflow");
        }
        ptr++;
        data[ptr] = obj;
        return true;
    }

    public  int  pop() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
        }

 /*       int removed = data[ptr];
        ptr--;
        return removed;
       OR

  */
        return data[ptr--];

    }

    private boolean isFull() {
        return ptr==data.length-1;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }

    public int peek() throws Exception{

        if(isEmpty()) {
            throw new Exception("stack is empty");
        }
        return data[ptr];
    }


    public static void main(String[] args) throws Exception {

        CustomStack stack=new CustomStack();

        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        System.out.println(stack.push(4));

        System.out.println(stack.peek()+ " peek element");
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }


}
