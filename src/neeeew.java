class param{
    private int i;
    private int j;

    void set(int...y){
        this.i = y[0];
        this.j = y[1];

    }
    String get(){
        return j + "\n"+ i;
    }
}
public class neeeew{
    public static void main(String []args){
        param ob = new param();
        ob.set(2,3);
        System.out.println(ob.get());
    }
}