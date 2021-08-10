class AA{
    AA(){
        System.out.println("CLASS A");
    }
}
class BB extends AA{
    BB(){
        System.out.println("CLASS B");
    }
}
class CC extends BB{
    CC(){
        System.out.println("CLASS C");
    }
}
public class layers {
    public static void main(String []args){
        CC c = new CC();
    }
}
