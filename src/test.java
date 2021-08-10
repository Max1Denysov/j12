class exam{
    static boolean question(String str, String end){
        return str.endsWith(end);
    }
}
public class test {
    public static void main(String []args){
        exam mytest = new exam();
        System.out.println( mytest.question("Hello","llo"));
        System.out.println( mytest.question("Before","fore"));
        System.out.println( mytest.question("Daddy","Dad"));
    }
}

