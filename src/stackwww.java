class steckq{
    private  int stck[];
    private int LastELn;

    steckq(int size){
        stck = new int[size];
        LastELn = -1 ;
    }

    void push(int item){
        if (LastELn == stck.length - 1)
            System.out.println("Full stack");
        else
            stck[++LastELn] = item;
    }

    public int pop(){
        if (LastELn < 0) {
            System.out.println("Empty stack");
            return 0;
        }
        else {
            return stck[LastELn--];
        }
    }
}



public class stackwww {
    public static void main(String args[]){
        steckq myf = new steckq(100);
        steckq mys = new steckq(50);

        for(int i = 0; i < 100;i++){
            myf.push(i);
        }

        for(int i = 0; i < 51;i++){
            mys.push(i);
        }
        System.out.println("First Have: ");
        for (int i = 0 ; i < 99;i++)
            System.out.print(myf.pop() + " ");
        System.out.println("\nSecond Have: ");
        for(int i = 0 ; i < 50;i++){
            System.out.print(mys.pop() + " ");
        }
    }
}
