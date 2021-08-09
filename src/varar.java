


public class varar {
    static void test(int...a){
        for(int b : a)
            System.out.println(b*b+" = int ");

    }

    static void  test(String...a){
        for (String b : a)
            System.out.println( b + " = String");
    }

    static void test(boolean...a){
        for(Boolean b : a)
            System.out.println(b + " = boolean");
    }

    public static void main(String args[]){
        test(2);
        test(2,2 ,3);
        test(true,false);
        test("hello");

    }
}
