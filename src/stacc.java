class STaCK{
    private int stack[];
    private int LastNumb;
    STaCK(int size){
        stack = new int[size];
        LastNumb = -1;
    }

    void push(int item){
        if (LastNumb == stack.length - 1 ){
            System.out.println("Full Stack");
        }
        else{
            stack[++LastNumb] = item;
        }
    }

    public int pop(){
        if (LastNumb < 0){
            System.out.println("Empty Stack");
            return 0;
        }
        else
            return stack[LastNumb--];
    }
}


public class stacc {
    public static void main(String []args){
        STaCK myFist = new STaCK(100);

        for(int i = 0 ; i < 101 ; i ++)myFist.push(i);

        System.out.println("Stack Have: ");
        for(int i = 0 ; i < 101;i++)
            System.out.print(myFist.pop() + " ");
    }
}
