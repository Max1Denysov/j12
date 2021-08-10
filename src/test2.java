class qw{
    private String Start ;
    private String End;
    qw(String one, String two){
        this.Start = one;
        this.End = two;
    }
    public  boolean ans(){
        return Start.endsWith(End);
    }
}
public class test2 {
    public static void main(String []args){
        qw qwestion = new qw("Markes","kes");
        System.out.println(qwestion.ans());
    }
}
