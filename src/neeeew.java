class a{
    int i,j;
    void shovij(){
        System.out.println("i,j = "+ i +"," + j);
    }
}
class b extends a{
    int k;
    void shovk(){
        System.out.println("k = "+ k);
    }
    void sum(){
        System.out.println("i + j + k = " +(i +j+k));
    }
}
public class neeeew{
    public static void main(String []args){
        a myob = new a();
        b mybb = new b();
        myob.i = 15;
        myob.j = 22;
        myob.shovij();
        mybb.i = 10;
        mybb.j = 12;
        mybb.k = 44;
        mybb.shovij();
        mybb.shovk();
        mybb.sum();
    }
}